import java.io.BufferedReader;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class XuLyFile{
	private ArrayList<ClassData> classData = new ArrayList<ClassData>();
	
	public void Process(File[] files, int j) throws IOException{
		FileInputStream fis = new FileInputStream( new File(files[j].getAbsolutePath()));	
		BufferedReader br = new BufferedReader(new InputStreamReader (fis));
		
		String className = ""; 
		String superClassName = ""; 
		String implementName = "";
		String classLine = "";
		int classLineIndex = 0, classNameIndex = 0, superClassNameIndex = 0, implementNameIndex = 0;
		String line ="";
		String text ="";

		while( (line = br.readLine()) != null ){
			line = line.trim();
			text = text + line +"\n";
			text = text.replace(" (", "(");
			text = text.replace(") {", "){");

		}


		String[] lines = text.split("\n");

		for(int i = 0; i < lines.length; i++){
			if(lines[i].contains("class")){
				classLineIndex = i;
				classLine = lines[classLineIndex];
			}
		}

		String[] lines_Class = classLine.split("\\{")[0].split(" ");

		for (int i = 0; i < lines_Class.length ; i++ ){
			if( lines_Class[i].equals("class")){
				classNameIndex = i+1;
				className = lines_Class[classNameIndex];
			}
			if( lines_Class[i].equals("extends")){
				superClassNameIndex = i+1;
				superClassName = lines_Class[superClassNameIndex];
			}
			if( lines_Class[i].equals("implement")){
				implementNameIndex = i+1;
				implementName = lines_Class[implementNameIndex];
			}

		}

		for (int i = 0; i < lines.length; i++){
			if(lines[i].endsWith("{")){
				if(lines[i].contains("(")  &&  lines[i].contains(")") ){

					
				}
			}
		}








		
		ClassData class_data = new ClassData(className, superClassName, implementName);
		class_data.printDataClass();	
	}
}

