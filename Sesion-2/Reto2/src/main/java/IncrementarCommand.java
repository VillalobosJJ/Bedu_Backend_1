public class IncrementarCommand implements Command{
    @Override
    public int execute(int counter){
        return counter + 1;
    }
    public int unexecute(int counter){
        return counter - 1;
    }
}