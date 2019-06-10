import java.io.*;
class TestDrive{
	public static void main(String[] args) throws IOException{
		String path = "C:/Users/vuduc/OneDrive/Desktop/Java/Tuan 5 Test";
		File file = new File(path);
		File[] listOfFiles = file.listFiles();
		XuLyFile xuly = new XuLyFile();
		for(int i = 0; i < listOfFiles.length; i++){
			xuly.Process(listOfFiles, i);
		}
	}
}