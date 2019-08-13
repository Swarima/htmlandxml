package com.zensar.sax.parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Moviexmlparser {

	public static void main(String[] args){
		// TODO Auto-generated method stub
SAXParserFactory factory=SAXParserFactory.newInstance();
SAXParser parser;
try {
	parser = factory.newSAXParser();

parser.parse(new File("./src/moviedetails.xml"),new Moviexmlhandler());
	}
	catch (ParserConfigurationException | SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
