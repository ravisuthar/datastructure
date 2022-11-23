package designpattern.sort;


interface Executor{
	void execute(String command);
}

class CommandExecutor implements Executor{

	@Override
	public void execute(String command) {
		System.out.println("Executing command "+command);
	}
	
}

class CommandExecutorProxy  implements Executor{

	private boolean isAdmin;
	private Executor executor;
	public CommandExecutorProxy(String name, String pwd) {
		if(name.equals("ravi") && pwd.equals("ravi")) {
			isAdmin=true;
		}
		executor=new CommandExecutor();
	}
	@Override
	public void execute(String command) {

			if(command.equals("del")) {
				if(isAdmin) {
					executor.execute(command);
				}else {
					System.out.println("you are not allowed!");
				}
			}else {
				executor.execute(command);
			}
			
	}
	
}

public class TestProxyDesignPattern {

	public static void main(String[] args) {
		
		CommandExecutorProxy p= new CommandExecutorProxy("rahul", "ravi");
		p.execute("ls");
		
	}
}
