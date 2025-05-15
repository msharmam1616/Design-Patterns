import java.util.Map;
import java.util.Stack;

public class Remote {
   private Map<String, Button> buttonMap;
   private Stack<ICommand> commandStack;
   public Remote(Map<String, Button> buttonMap){
       this.buttonMap= buttonMap;
       commandStack= new Stack<>();
   }

   public void pressCommand(String command){
       if(buttonMap.containsKey(command)){
           Button button= buttonMap.get(command);
           button.execute();
           commandStack.push(button.command);
       }else{
           System.out.println("Command doesn't exist!!");
       }
   }

   public void undoLastCommand(){
       if(!commandStack.isEmpty()){
           ICommand commandToUndo= commandStack.pop();
           System.out.println("Undoing ");
           commandToUndo.undo();
       }else{
           System.out.println("Can't UNDOOO!");
       }
   }
}
