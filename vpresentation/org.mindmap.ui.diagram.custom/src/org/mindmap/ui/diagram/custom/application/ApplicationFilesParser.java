package org.mindmap.ui.diagram.custom.application;



import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * Class for parsing the applicationFiles.xml file.
 */
public class ApplicationFilesParser
{

  /**
   * Gets the instance of ApplicationFilesParser.
   * 
   * @return The unique instance of Application FilesParser.
   */
  public static ApplicationFilesParser getInstance()
  {
    if (instance == null)
    {
      instance = new ApplicationFilesParser();
    }
    return instance;
  }

  /**
   * Gets the name (path included) of the transformation file for Activities
   * diagrams.
   * 
   * @return The name of the activities transformation file.
   */
  public String getActivitiesTransformationFile()
  {
    return pathsMap.get(PARAMETER_ACTIVITIES_TRANSFORMATION_FILE);
  }

  /**
   * Gets the name (path included) of the transformation file for Concepts
   * diagrams.
   * 
   * @return The name of the concepts transformation file.
   */
  public String getConceptsTransformationFile()
  {
    return pathsMap.get(PARAMETER_CONCEPTS_TRANSFORMATION_FILE);
  }

  /**
   * Constructor. Makes the parsing of the xml file.
   */
  private ApplicationFilesParser()
  {
    try
    {
      // Gets the document builder
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance()
          .newDocumentBuilder();

      // Gets the Document from XML file
      Document doc = documentBuilder.parse(new InputSource(new FileInputStream(
          APPLICATION_FILES_FILENAME)));

      // Gets the information from each node
      Element filesE = doc.getDocumentElement();
      NodeList filesList = filesE.getElementsByTagName(TAG_FILE);
      for (int i = 0; i < filesList.getLength(); i++)
      {
        Node file = filesList.item(i);
        String fileId = file.getAttributes().getNamedItem(ATTRIBUTE_ID)
            .getTextContent();
        String filePath = file.getAttributes().getNamedItem(ATTRIBUTE_PATH)
            .getTextContent();
        pathsMap.put(fileId, filePath);
      }
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }

  // --------------------------------------------------------------------------
  // Private Attributes

  private static ApplicationFilesParser instance = null;
  private Map<String, String> pathsMap = new HashMap<String, String>();

  // --------------------------------------------------------------------------
  // Private constants

  private static final String APPLICATION_FILES_FILENAME = "applicationFiles.xml";
  private static final String TAG_FILE = "file";
  private static final String PARAMETER_CONCEPTS_TRANSFORMATION_FILE = "conTransformationFile";
  private static final String PARAMETER_ACTIVITIES_TRANSFORMATION_FILE = "actTransformationFile";
  private static final String ATTRIBUTE_ID = "id";
  private static final String ATTRIBUTE_PATH = "path";
}
