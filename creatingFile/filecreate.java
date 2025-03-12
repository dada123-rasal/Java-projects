package creatingFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecreate {
	
	
	public void createfile() throws IOException {
		File f=new File("C:\\Users\\Admin\\Desktop\\filestxt\\firstfile.txt");
		if(f.createNewFile()) {
			System.out.println("file successfully created");
		}else if(f.exists()){
			System.out.println("file already exist");
			System.out.println("file name :"+f.getName());
			System.out.println("file absolute path :"+f.getAbsolutePath());
			System.out.println("file path  :"+f.getPath());
			System.out.println("file parent :"+f.getParent());
			System.out.println("file hashcode :"+f.hashCode());
			System.out.println("file size :"+f.length());
			System.out.println("file read :"+f. canRead());
			System.out.println("file write"+f.canWrite());
			System.out.println("file is file :"+f.isFile());
			System.out.println("file hidden :"+f.isHidden());
			System.out.println("file url :"+f.toURL());
			System.out.println("file uri  "+f.toURI());
			System.out.println("file getusablespace  :"+f.getUsableSpace());
			System.out.println("file gettotalspace  :"+f.getTotalSpace());
			System.out.println("file tostring  :"+f.toString());
		}else {
			System.out.println("file does not exist");
		}

		
	}
	   
	
	
	public void writefile()throws IOException
	{
		try{
		FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\filestxt\\WriteFile.txt");
		 try{
			fw.write("hi i am a writable file"); 
		 }finally {
			fw.close();
		}
		 System.out.println("successfully data wrote in file ");
	}catch (IOException i) {
		i.printStackTrace();
	}
		
		
	}
	public void readfile()throws IOException
	{
		try {
			FileReader r=new FileReader("C:\\Users\\Admin\\Desktop\\filestxt\\first.txt");
			try {
				int i;
				while((i=r.read())!=-1)
				   {
					System.out.print((char)i);
				    }
			}finally {
				r.close();
			    }
		System.out.println("\n successfully read");
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}
public void copyfile()throws IOException
{
	FileReader r=new FileReader("C:\\Users\\Admin\\Desktop\\filestxt\\firstfile.txt");
    FileWriter w=new FileWriter("C:\\Users\\Admin\\Desktop\\filestxt\\first.txt");
             int i;
             while((i=r.read())!=-1)
             {
            	 w.write((char)i);
             }
             r.close();
             w.close();
         System.out.println("successfully copy");
}
	public static void main(String[] args) throws IOException {

		filecreate file= new filecreate();
		//file.createfile();
		//file.writefile();
		
		file.copyfile();
		file.readfile();
		
	}

}
