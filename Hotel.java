package yourturn3;
/**
 * @author Simran Brar
 */
public class Hotel
{
   private String[] room = new String[10];
   private int numRoomsAvailable;

   public Hotel ()
   {
      for (int roomNo = 0; roomNo < room.length; roomNo++) {
         room[roomNo] = "Empty";
         this.numRoomsAvailable++;
      }
   }

   public void hotelStatus ()
   {
      for (int roomNo = 0; roomNo < room.length; roomNo++) {
         System.out.println("Room#" + roomNo + this.room[roomNo]);

      }
   }

   public void checkInGuest (String guestName) throws Exception
   {
      int emptyRoom = 0;
      for (int roomNo = 0; roomNo < room.length; roomNo++) {
         if (this.room[roomNo].equals("Empty")) {
            room[roomNo] = guestName;
            this.numRoomsAvailable--;
            return;
         }
      }
      throw new Exception();
   }

   public int numRoomsEmpty ()
   {

      return this.numRoomsAvailable;
   }

   public boolean isRoomsAvailable ()
   {
      boolean availability;
      if (this.numRoomsAvailable <= 0) {
         availability = false;
      }
      else {
         availability = true;
      }
      return availability;
   }

   public String checkOut (String name)
   {
      String message = "";
      for (int roomNo = 0; roomNo < room.length; roomNo++) {
         if (room[roomNo].equals(name)) {
            message = name + " is checking out....They owe us money";
            return message;
         }
      }
      return "there is no guest named" + name;
   }
}
