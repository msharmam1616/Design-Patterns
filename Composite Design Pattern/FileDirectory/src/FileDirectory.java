import java.util.ArrayList;
import java.util.List;

public class FileDirectory implements FileSystem{

    List<FileSystem> fileList;
    String name;

    FileDirectory(String name){
        this.fileList= new ArrayList<>();
        this.name= name;
    }

    public void addFile(FileSystem fs){
        this.fileList.add(fs);
    }

    @Override
    public void ls(){
        for(FileSystem fs: fileList){
            System.out.println(name+'/');
            fs.ls();
        }
    }
}
