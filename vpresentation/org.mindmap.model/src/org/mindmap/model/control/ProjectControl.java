package org.mindmap.model.control;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.emfstore.client.ESLocalProject;
import org.eclipse.emf.emfstore.client.ESWorkspaceProvider;
import org.eclipse.emf.emfstore.internal.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.internal.client.model.Workspace;
import org.eclipse.emf.emfstore.internal.client.model.impl.api.ESWorkspaceImpl;
import org.eclipse.ui.IWorkbenchWindow;

public class ProjectControl {

	public static ESLocalProject actualproject=null;
	public static boolean update=false;
	public static boolean continuarupdate=false;

	public static IWorkbenchWindow importConceptsWindow=null;
	public static IWorkbenchWindow importActivitiesWindow=null;
	public static IWorkbenchWindow principalWindow;
	public static ESLocalProject importproject=null;
	public static boolean checkoutrunning=false;
	public static boolean importrunning=false;
	
	public static int buscarProyectoLocal(List<ESLocalProject> lista,String st)
	{
		int res=-1;
		int i = 0;
		while (i < lista.size()
				&& !lista.get(i).getProjectName().equals(st)) {
			i++;
		}
		
		if (i < lista.size()) {//encontrado
			res=i;
		}else{
			res=-1;
		}
		
		return res;
	}
	
	
	public static ProjectSpace  getActualProjectSpace()
	{
		ESLocalProject p = ProjectControl.actualproject;
		ESWorkspaceImpl workspace = (ESWorkspaceImpl) ESWorkspaceProvider.INSTANCE
				.getWorkspace();
		Workspace w = workspace.toInternalAPI();
		//Project pw=(Project)p;
		EList<ProjectSpace> k = w.getProjectSpaces();
		int cont = 0;
		while (cont < k.size()
				&& !p.getLocalProjectId().getId()
						.equals(k.get(cont).getIdentifier())) {
			cont++;
		}
		ProjectSpace ps = null;
		if (cont < k.size()) {
			ps = k.get(cont);
		}
		
		return ps;
	}
	
	public static void limpiarCarpetaScorm()
	{//Solo hay 2 niveles a lo sumo
		String path = ProjectUtilities.PROJECT_DIRECTORY;
		File temp = new File(path);
		if(temp.exists())
		{
			String[]entries =temp.list();
			for(String s: entries){
			    File currentFile = new File(temp.getPath(),s);
			    if(currentFile.isDirectory())
			    {
			    	String[] subfiles = currentFile.list();
			    	for(String s2:subfiles)
			    	{
			    		File subfile=new File(currentFile.getPath(),s2);
			    		subfile.delete();
			    	}
			    }
			    currentFile.delete();
			    
			}
		}
	}
}
