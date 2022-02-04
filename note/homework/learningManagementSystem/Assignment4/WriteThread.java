package LMSAssignment.Assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.concurrent.BlockingQueue;

public class WriteThread implements Runnable{

    protected BlockingQueue<String> blockingQueue = null;

    public WriteThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        FileWriter writer = null;

        try {
            writer = new FileWriter(".\\src\\main\\java\\LMSAssignment\\Assignment4\\output.txt");

            while(true){
                String buffer = blockingQueue.take();
                //Check whether end of file has been reached
                if(buffer.equals("EOF")){
                    break;
                }
                writer.write(buffer);
                writer.write('\n');
            }


        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch(InterruptedException e){

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}