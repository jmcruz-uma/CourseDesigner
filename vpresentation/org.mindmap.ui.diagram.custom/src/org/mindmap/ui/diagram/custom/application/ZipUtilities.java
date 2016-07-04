package org.mindmap.ui.diagram.custom.application;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class ZipUtilities {

	// --------------------------------------------------------------------------
	// Public Methods

	/**
	 * Decompresses given zip file in the given directory.
	 * 
	 * @param file
	 *            File to decompress.
	 * @param outputDir
	 *            Target directory.
	 * @throws Exception
	 */
	public static void unzipArchive(File file, File outputDir) throws Exception {
		if (!outputDir.exists()) {
			outputDir.mkdir();
		}

		ZipFile zipfile = new ZipFile(file);
		for (Enumeration<? extends ZipEntry> e = zipfile.entries(); e
				.hasMoreElements();) {
			ZipEntry entry = (ZipEntry) e.nextElement();
			unzipEntry(zipfile, entry, outputDir);
		}
	}

	

	public static void zipScorm(File projectFile, File openedProjectDir)
			throws Exception {
		
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(
				projectFile+".zip"));

		File[] projectFiles = openedProjectDir.listFiles();

		for (int i = 0; i < projectFiles.length; i++) {
			File source = projectFiles[i];

			boolean dir = source.isDirectory();

			if (dir) {
				
				
				
				File[] sourceFiles = source.listFiles();
				for (int j = 0; j < sourceFiles.length; j++) {
					FileInputStream fis = new FileInputStream(sourceFiles[j]);
					zos.putNextEntry(new ZipEntry(source.getName()+File.separator+sourceFiles[j].getName()));

					int size = 0;
					byte[] buffer = new byte[1024];

					// Read data to the end of the source file and write it to
					// the zip
					// output stream.
					while ((size = fis.read(buffer, 0, buffer.length)) > 0) {
						zos.write(buffer, 0, size);
					}

					zos.closeEntry();
					fis.close();
				
				zos.closeEntry();
				}
			} else {
				FileInputStream fis = new FileInputStream(source);

				// Put a new ZipEntry in the ZipOutputStream
				zos.putNextEntry(new ZipEntry(source.getName()));

				int size = 0;
				byte[] buffer = new byte[1024];

				// Read data to the end of the source file and write it to the
				// zip
				// output stream.
				while ((size = fis.read(buffer, 0, buffer.length)) > 0) {
					zos.write(buffer, 0, size);
				}

				zos.closeEntry();
				fis.close();
			}
		}

		// Finish zip process
		zos.close();
	}

	// --------------------------------------------------------------------------
	// Private Methods

	/**
	 * Unzips an entry of a zip file.
	 * 
	 * @param zipfile
	 *            The zip file.
	 * @param entry
	 *            The entry to be unzipped.
	 * @param outputDir
	 *            The directory in which the file will be placed.
	 * @throws IOException
	 */
	private static void unzipEntry(ZipFile zipfile, ZipEntry entry,
			File outputDir) throws IOException {
		File outputFile = new File(outputDir, entry.getName());

		BufferedInputStream inputStream = new BufferedInputStream(
				zipfile.getInputStream(entry));
		BufferedOutputStream outputStream = new BufferedOutputStream(
				new FileOutputStream(outputFile));

		try {
			copy(inputStream, outputStream);
		} finally {
			outputStream.close();
			inputStream.close();
		}
	}

	/**
	 * Copies an input stream in an output stream.
	 * 
	 * @param in
	 *            The input stream.
	 * @param out
	 *            The output stream.
	 * @throws IOException
	 */
	private static void copy(InputStream in, OutputStream out)
			throws IOException {
		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

}
