/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geust_house.myFrame;

/**
 *
 * @author SIENGHORN
 */
public class SqlConfigString {
    final static String INSERT_ONE_BOOKING
            ="insert into book(book_date,book_chekIn_date,book_checkOut_date,staff_id,cus_id) values(?,?,?,?,?);";
     final static String INSERT_ONE_TOBOOK_DETAIL=
            "insert into book_detail(book_id,room_id,book_price,status) values(?,?,?,?);"
    ;
    final static String VIEW_ROOM="select * from view_room;";
    final static String UPDATE_ROOM="update room set status_id=? where room_id=?;";
    final static String GET_MAX_BOOK_ID="select max(book_id) from book;";
    final static String GET_LAST_RECORDOF_GEUSTID="select max(cus_id) from customer;";
    final static String INSERT_ONE_INTO_GEUST="insert into customer(cus_name,cus_phone,cus_ic) values(?,?,?)";
    final static String INSERT_ONE_INTO_GEUST_BYCHECKIN="insert into customer(cus_name,cus_gender,cus_address,cus_ic) values(?,?,?,?)";
    final static String SELECT_ROOM="select room_id,floor,description,price from view_room where room_status= ?";
    final static String SELECT_CHECKOUT_DATE="select book_id,book_checkout_date from book ;";
    final static String ROOM_ID_FROMBOOKDETAIL="select room_id from book_detail where book_id=?";
    final static String UPDATE_ROOM_INBOOKDETAIL="update book_detail set status=? where room_id=?";
    final static String SELECT_ROOMPRICE="select price from room JOIN roomtype on room_type_id=type_id join room_price on roomtype.type_id=room_price.room_type_id where room_id=? and typeof_living_id=?";
     final static String SELECT_LASTID_CUST="select max(cus_id) from customer";
     final static String SELECT_ROOM_CHECKIN="select room_id from book_detail where book_id=?;";
     final static String SELECT_BOOKID_FORCHECKIN="select DISTINCT book_id from book_detail where status='Booking'";
     final static String INSERT_INTO_CHECKIN="insert into check_in(staff_id,book_id,cus_id) values(?,?,?)";
     final static String INSERT_INTO_CHECKIN_NOBOOKID="insert into check_in(staff_id,cus_id) values(?,?)";
     final static String INSERT_INTO_CHECKIN_DETAIL="insert into check_in_detail values(?,?,?,?,?,?,?,?)";
     final static String SELECT_CHECKIN_ID="select max(check_in_id) from check_in;";
     final static String SELECT_PRODUCT="Select * from product";
     final static String SELECT_PRODUCT_BYNAME="Select * from product where product_name=?";
     final static String SELECT_PRODUCT_IMPORT="Select * from product WHERE product_type_id!=?;";
     final static String INSERT_INTO_PRO_TRANSACTION="insert into product_transaction values(?,?,?,?,?,?)";
     final static String STOCK_BALANCING="SELECT SUM(QTY) FROM PRODUCT_TRANSACTION WHERE PRODUCT_ID=?";
     final static String SELECT_COSTOFPRODUCT_TOUPDATE="select cost from product where product_id=?";
     final static String UPDATE_PRODUCT_COST="update product set cost=? where product_id=?";
     final static String SELECT_MAXID_INVOICE="select max(invoice_id) from invoice;";
     final static String INSERT_INTO_INVOICE="insert into invoice(invoice_date,cus_id,staff_id,total,pay_amount) values(?,?,?,?,?)";
     final static String GET_CUSID_TO_INSERT_INTO_INVOICE=
             "select c.cus_id from customer c join check_in ch on c.cus_id=ch.cus_id join check_in_detail cd on ch.check_in_id=cd.check_in_id where room_id=?;";
     final static String INSERT_INTO_INVOICE_DETAIL="insert into invoice_detail values(?,?,?,?,?)";
     final static String SELECT_PRODUCT_TYPE="select product_type_id from product where product_id=?";
     final static String GET_CUNAME_INSERTINTO_CHECKOUT=
             "select c.cus_name,cd.check_in_date,cd.check_in_id,c.cus_id from customer c join check_in ch "
             + "on c.cus_id=ch.cus_id join check_in_detail cd on ch.check_in_id=cd.check_in_id where room_id=?\n" +
            "ORDER BY check_in_id desc limit 1 ;";
     final static String GET_OTHER_CHARGE_OFSERVICE=
             "select total,pay_amount from invoice i join check_in c on c.cus_id=i.cus_id "
             + "join check_in_detail ch on c.check_in_id=ch.check_in_id "
             + "join room r on ch.room_id=r.room_id where r.room_id=?;";
     final static String SELECT_BOOK_CHECKOUTDATE="selct * from view_book_checkout_date;";
     final static String INSERT_INTO_CHECK_OUT="insert into checkout(checkOut_date,checkin_id,staff_id,cus_id) values(?,?,?,?)";
     final static String INSERT_INTO_CHECK_OUT_DETAL="insert into checkout_detail values(?,?,?,?)";
     final static String GET_MAX_CHECKOUT_ID="select max(checkout_id) from checkout;";
     final static String GET_CHECKIN_ID_AND_ROOMID_FOR_CHANGE_ROOM=
             "SELECT c.check_in_id,c.cus_id,cd.check_in_date,cd.Adult,cd.Children,cd.pay\n" +
"from check_in c join check_in_detail cd on c.check_in_id=cd.check_in_id where cd.room_id=?";
     final static String CHECK_BOOK_PRICE_OF_ROOM="select ch.book_id from check_in ch join check_in_detail cd on ch.check_in_id=cd.check_in_id where cd.room_id=?";
     final static String SELECT_BOOK_PRICE=
             "select book_detail.book_price from book_detail join book on book_detail.book_id=book.book_id where book.book_id=?;";
     final static String INSERT_INTO_CHANGE_ROOM=
             "insert into changeroom(changeroom_date,old_check_in_id,old_room_id,staff_id,cus_id) values(?,?,?,?,?)";
     final static String SELECT_LASTRECORD_CHNAGEROOM="select max(changeroom_id) from changeroom";
     final static String INSERT_INTO_CHANGEROOM_DETAIL="insert into changeroom_detail values(?,?,?,?)";
     final static String SELECT_ALL_FROM_CHECK_IN_DETAIL="select * from check_in_detail_view";
     final static String UPDATE_STATUS_BOOK_DETAIL="update book_detail set status=? where book_id=?"; 
    final static String PRICE_OLD_ROOM="select OLD_ROOM_PRICE from changeroom_detail where new_check_in_id=?";

}