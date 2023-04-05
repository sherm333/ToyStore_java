import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class run {
  public static void main(String[] args) throws IOException {
      System.out.println("Розыгрыш... Смотрите файл 'results.txt'");
      Raffle raffle = new Raffle();
      raffle.add(new Toy(1, "Конструктор"), 2);
      raffle.add(new Toy(2, "Робот"), 2);
      raffle.add(new Toy(3, "Кукла"), 6);

      saveResults(raffle);
  }

  public static void saveResults (Raffle raffle) throws IOException{
    BufferedWriter outputWriter = null;
    outputWriter = new BufferedWriter(new FileWriter("results.txt"));
    ItemForRaffle result = raffle.get();
    while(result != null){
      outputWriter.write(result.toString());
      outputWriter.newLine();
      result = raffle.get();
    }
    outputWriter.flush();  
    outputWriter.close();  
  }
}