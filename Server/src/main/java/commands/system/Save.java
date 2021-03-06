
package commands.system;

import collections.JavaIO;
import collections.StackCollection;
import commands.*;
import entities.HumanBeing;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;

public class Save extends CommandsToCollection {
    public Save() {
        super("save", CommandArgs.NO_ARGS, "save the collection to a file");

    }

    public ServerResult function(String ... arguments) {

        try {
            Iterator iterator = StackCollection.entitiesCollection.iterator();

            while(iterator.hasNext()) {
                HumanBeing obj = (HumanBeing)iterator.next();
                JavaIO.writeToFile(obj.csvToString() + "\n");
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Success save in file");
            return new ServerResult(arrayList,true);
        }
        catch (Exception e) {
            return new ServerResult(false);
        }
    }


}
