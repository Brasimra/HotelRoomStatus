package yourturn3;

/**
 *
 * @author Rich Smith
 *
 * Read through this code...Can you write the Hotel class to give the following
 * output?
 *
 * Hotel Status:
 * Room #0: Empty Room #1: Empty Room #2: Empty Room #3: Empty Room #4: Empty Room #5: Empty Room #6: Empty Room #7: Empty Room #8: Empty Room #9: Empty
 * Hotel Status:
 * Room #0: Sam Smith Room #1: Mark Room #2: Amna Room #3: Empty Room #4: Empty Room #5: Empty Room #6: Empty Room #7: Empty Room #8: Empty Room #9: Empty
 * true
 * There are 7 rooms empty
 * Amna is checking out...They owe us money!
 * There is no guest named Alfredo
 * There are 8 rooms empty
 *
 */
public class Start
{
   public static void main (String[] args) throws Exception
   {
      Hotel h1 = new Hotel();
      h1.hotelStatus();
      try {
         h1.checkInGuest("Sam Smith");
         h1.checkInGuest("Mark");
         h1.checkInGuest("Amna");
         h1.hotelStatus();
      }
      catch (Exception err) {
         System.out.println("Sorry, the hotel is full");
      }
//
      System.out.println(h1.isRoomsAvailable());
      System.out.println("There are " + h1.numRoomsEmpty() + " rooms empty");
      System.out.println(h1.checkOut("Amna"));
      System.out.println(h1.checkOut("Alfredo"));
      System.out.println("There are " + h1.numRoomsEmpty() + " rooms empty");
   }
}
