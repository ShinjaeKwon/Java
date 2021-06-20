import java.util.ArrayList;

public class Hotel {
    private String name;
    private int star;
    //private Room[] roos;
    ArrayList<Room> rooms; //ArrayList<Room> 객체 변수 선언
    //Inner Class
    public class Room{
        private int roomNo, beds, price;
        private String type;

         Room(int roomNo, int beds, int price, String type) {
            this.roomNo = roomNo;
            this.beds = beds;
            this.price = price;
            this.type = type;
        }
        public int getRoomNo() {
            return roomNo;
        }

        public void setRoomNo(int roomNo) {
            this.roomNo = roomNo;
        }

        public int getBeds() {
            return beds;
        }

        public void setBeds(int beds) {
            this.beds = beds;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Room{" +
                    "roomNo=" + roomNo +
                    ", beds=" + beds +
                    ", price=" + price +
                    ", type='" + type + '\'' +
                    '}';
        }

    }

    public Hotel(String name, int star) {
        this.name = name;
        this.star = star;
        rooms = new ArrayList<Room>();  //Room 생략 가능
        setRooms();
    }
    private void setRooms(){    //기본적인 룸 생성
        rooms.add(new Room(101, 2, 110000, "슈페리어"));
        rooms.add(new Room(102, 2, 110000, "슈페리어"));
        rooms.add(new Room(103, 2, 110000, "슈페리어"));
        rooms.add(new Room(104, 2, 110000, "슈페리어"));
        rooms.add(new Room(201, 4, 210000, "디럭스"));
        rooms.add(new Room(202, 8, 300000, "패밀리"));
    }
    public void showRooms(){
        for(Room room : rooms)
            System.out.println(room);
    }
    public Room getRoom(int no){
        for(Room room : rooms)
            if(room.getRoomNo() == no) return room;
            return null;
    }
}
