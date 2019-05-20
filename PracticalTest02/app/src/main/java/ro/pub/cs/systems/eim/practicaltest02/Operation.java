package ro.pub.cs.systems.eim.practicaltest02;

import android.util.Log;

public class Operation {

    public static Integer GetResult(String operation)
    {
        try
        {
            String[] parts = operation.split(",");
            int op1 = Integer.parseInt(parts[1]);
            int op2 = Integer.parseInt(parts[2]);
            String operationType = parts[0];
            if(operationType.equals("mul"))
            {
                Thread.sleep(2000);
                return op1 * op2;
            }
            else if(operationType.equals("add"));
            {
                return op1 + op2;
            }
        }
        catch (Exception ex)
        {
            Log.i(Constants.TAG, "Error parsing operation");
        }

        return null;
    }


}
