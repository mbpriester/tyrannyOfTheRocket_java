import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    System.out.println("Hello world!");;
    System.out.println(calculateFuelReqts(new FileReader("./input.txt")));
  }

  private static Integer calculateFuelReqts(FileReader inputFile) throws IOException {
    BufferedReader reader;
    Integer sumOfAllFuelReqts = 0;

    try{
      reader = new BufferedReader(inputFile);
      String newLine = reader.readLine();
      while(newLine != null){
        System.out.println("new Line: " +newLine);
        Integer mass = Integer.valueOf(newLine);
        Integer currentFuelRequired = ((int)Math.floor( mass/3 )) - 2;
        sumOfAllFuelReqts += currentFuelRequired;

        newLine = reader.readLine();
      }
    }
    catch(IOException ex){
      ex.getMessage();
    }
    return sumOfAllFuelReqts;
  }
}