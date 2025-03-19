public class File implements FileSystem{

    private String name;

    File(String name){
        this.name= name;
    }

    @Override
    public void ls(){
        System.out.println(name);
    }
}
