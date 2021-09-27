import java.util.ArrayList;
import java.lang.Math.*;

public class GradeBook
{
   private double[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
       // Rounded to two decimal places because I was gonna jump off a bridge if I kept getting numbers like 145.670000000000000000000000000000002
      return (double)Math.round(total * 100) / 100;
   }


      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      // STUDENT TODO: Implement your logic here

      // int smallest = -99; I don't get why this is here since we're working with doubles
      double min = scores[0];

      // If there are no scores, return 0
      if(scoresSize == 0) min = 0;

      // Algo to find min using Math.min(double d1, double d2);
      for(int i = 0; i < scoresSize; i++){
         min = Math.min(min, scores[i]);
      }
       // Rounded to two decimal places because I was gonna jump off a bridge if I kept getting numbers like 145.670000000000000000000000000000002
      return (double)Math.round(min * 100) / 100;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
          // Rounded to two decimal places because I was gonna jump off a bridge if I kept getting numbers like 145.670000000000000000000000000000002
         return (double)Math.round((sum() - minimum()) * 100) / 100;
   }

   /**
    * Gets the total length of the array "scores"
    * @returns the scoreSize
    */
   public int getScoresSize(){
      return scoresSize;
   }

   /**
    * Retursn the scores separated by a space
    * @return A sting object containing the scores separated by a space
    */
   @Override
   public String toString(){
      String string = "";
      for(int i =0; i < scoresSize; i++){
         string += scores[i] + " ";
      }

      // Using String.trim() to get rid of the trailing space
      return string.trim();
   }
}

