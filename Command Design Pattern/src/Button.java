public class Button {
    public ICommand command;

    public Button(ICommand command){
        this.command= command;
    }

    public void execute(){
        command.execute();
    }
}
