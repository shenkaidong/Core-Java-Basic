package LMSAssignment.Assignment4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class ReadThread implements Runnable{

    protected BlockingQueue<String> blockingQueue = null;

    public ReadThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    private String Calulate(String str)
    {
        int rst = 0;
        char lastOper = ' ';
        for(int i = 0; i < str.length(); i++)
        {
            char cur = str.charAt(i);
            if(cur<='9'&& cur>='0')
            {
                int num = cur - '0';
                if(lastOper != ' ')
                {
                    if(lastOper == '+')
                    {
                        rst += num;
                    }
                    else if(lastOper == '-')
                    {
                        rst -= num;
                    }
                }
                else
                {
                    rst += num;
                }
            }
            else if(cur == '+' && cur == '-')
            {
                lastOper = cur;
            }
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ').append('=').append(' ').append(rst);
        return sb.toString();
    }
    @Override
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(".\\src\\main\\java\\LMSAssignment\\Assignment4\\input.txt"));
            String buffer =null;
            while((buffer=br.readLine())!=null){
                if (!buffer.equals(""))
                {
                    blockingQueue.put(Calulate(buffer));
                }
                else
                {
                    blockingQueue.put(buffer);
                }

            }
            blockingQueue.put("EOF");

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } catch(InterruptedException e){

        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }



}