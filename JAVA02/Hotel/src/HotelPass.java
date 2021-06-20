public class HotelPass {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sweet Hotel", 4);
        hotel.showRooms();

        Hotel.Room myroom = hotel.getRoom(101);
        System.out.println(myroom);
    }
}
