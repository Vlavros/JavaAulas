package br.com.vlavros.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArchiveXML {
	private String path;
	private String fileName;
	// TODO declaration logic / prolog
	private String version, encoding, standalone;
	private String content;
	private ArrayList<TagXML> tag;
	// TODO xml-stylesheet
	// TODO DTD logic
	// TODO CML comment logic
	// TODO CDATA logic

	public ArchiveXML(String path) throws Exception {
		this.path = path;

		try {
			File file = new File(this.path);
			BufferedReader readFile = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			
			
			
		} catch (Exception e) {
			throw new Exception(e);
		}

	}

}
