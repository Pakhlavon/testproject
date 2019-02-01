package Databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Registratsiyadb extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="Registr";
    public static final String TABLE_NAME = "registr_table";
    public static final  String COL_1="ID";
    public static final  String COL_2="LOGIN";
    public static final  String COL_3="PAROL";

    public Registratsiyadb( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME +"(ID INTEGER PRIMARY KEY AUTOINCREMENT,LOGIN TEXT,PAROL TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean insetdata(String login,String parol){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,login);
        contentValues.put(COL_3,parol);

        long succes =db.insert(TABLE_NAME,null,contentValues);

        if (succes==-1){
            return false;
        }else {return true;}
    }
}
