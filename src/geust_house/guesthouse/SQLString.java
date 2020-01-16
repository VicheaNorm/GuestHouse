/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geust_house.guesthouse;

/**
 *
 * @author SIENGHORN
 */
public class SQLString {
    final static String CANCELBOOKING="update book_detail set status='Cancel Booking' where room_id=?";
    final static String INSERT_INTO_CANCELBOOK="insert into cancel_book(cancel_book_date,staff_id,book_id,cus_id) values(?,?,?,?)";
    final static String MAX_ID_CANCELBOOK="SELECT MAX(CANCEL_BOOK_ID) FROM CANCEL_BOOK;";
    final static String INSERT_INTO_CANCELBOOK_DETAIL="insert into cancel_book_detail values(?,?,?,?);";
    final static String UPDATE_ROOM_STATUS="update room set status_id=? where room_id=?;";
}
