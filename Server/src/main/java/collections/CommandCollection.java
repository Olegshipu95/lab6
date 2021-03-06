package collections;

import commands.AbstractCommand;
import commands.CheckTheCorrect;
import commands.Command;
import commands.system.*;
import lombok.Getter;

import java.util.HashMap;

public class CommandCollection {
    private static CommandCollection instance;
    private CommandCollection(){}
    public static synchronized CommandCollection getInstance(){
        if(instance == null){		//если объект еще не создан
            instance = new CommandCollection();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
    @Getter
    private HashMap<String, AbstractCommand> serverCollection = new HashMap();

    public synchronized static void commandManager() {
        new Connect();
        new Add();
        new AverageOfMinutesOfWaiting();
        new Clear();
        new Info();
        new PrintAscending();
        new RemoveById();
        new RemoveAt();
        new RemoveLower();
        new Save();
        new Show();
        new SumOfMinutesOfWaiting();
        new UpdateId();
    }

}