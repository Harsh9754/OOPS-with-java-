public class room {
    int roomno;
    String roomtype;
    float roomarea;

    void setdata(int rno,String rtype,float rarea){
        this.roomno=rno;
        this.roomtype=rtype;
        this.roomarea=rarea;
    }
    void displaydata(){
        System.out.println("Room number:"+roomno);
        System.out.println("Room type :" + roomtype);
        System.out.println("Room area :"+roomarea );
    }

    public static void main(String[] args){
        room myRoom = new room();
        room myRoom2 = new room();
        room myRoom3 = new room();

        myRoom.setdata(11,"Villa",120000f);
        myRoom2.setdata(15,"Mansion",150000f);
        myRoom3.setdata(17,"Banglow",100000f);

        myRoom.displaydata();
        myRoom2.displaydata();
        myRoom3.displaydata();        
    }
    
}
