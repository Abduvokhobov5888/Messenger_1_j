package com.example.a541j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a541j.Adapter.ChatAdapter;
import com.example.a541j.Models.Chat;
import com.example.a541j.Models.Message;
import com.example.a541j.Models.Room;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    void initViews(){
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        refreshAdapter(getAllChats());
    }

    void refreshAdapter(ArrayList<Chat> chats){
        ChatAdapter adapter = new ChatAdapter(chats, this);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<Chat> getAllChats(){
        ArrayList<Chat> chats = new ArrayList<Chat>();

        ArrayList<Room> rooms = new ArrayList<Room>();

        rooms.add( new Room(R.drawable.create,  "Create room"));
        rooms.add( new Room(R.drawable.nissan,  "Muslim Saidov"));
        rooms.add( new Room(R.drawable.volkswagen,  "Oybek Abdumannobov"));
        rooms.add( new Room(R.drawable.mbw,  "Doston Ibroximov"));
        rooms.add( new Room(R.drawable.mercedes,  "Abbosbek Abduvoxobov"));
        rooms.add( new Room(R.drawable.nissan,  "Muslim Saidov"));
        rooms.add( new Room(R.drawable.volkswagen,  "Oybek Abdumannobov"));
        rooms.add( new Room(R.drawable.mbw,  "Doston Ibroximov"));
        rooms.add( new Room(R.drawable.mercedes,  "Abbosbek Abduvoxobov"));
        rooms.add( new Room(R.drawable.nissan,  "Muslim Saidov"));
        rooms.add( new Room(R.drawable.volkswagen,  "Oybek Abdumannobov"));
        rooms.add( new Room(R.drawable.mbw,  "Doston Ibroximov"));
        rooms.add( new Room(R.drawable.mercedes,  "Abbosbek Abduvoxobov"));

        chats.add(new Chat(rooms));

        chats.add( new Chat( new Message(R.drawable.mercedes,  "Doston Ibroximov", false)));
        chats.add( new Chat(new Message(R.drawable.nissan,  "Abbosbek Abduvoxobov", false)));
        chats.add( new Chat(new Message(R.drawable.volkswagen,  "Muslim Saidov", true)));
        chats.add( new Chat( new Message(R.drawable.mercedes,  "Doston Ibroximov", false)));
        chats.add( new Chat(new Message(R.drawable.nissan,  "Abbosbek Abduvoxobov", false)));
        chats.add( new Chat(new Message(R.drawable.volkswagen,  "Muslim Saidov", true)));
        chats.add( new Chat( new Message(R.drawable.mercedes,  "Doston Ibroximov", true)));
        chats.add( new Chat(new Message(R.drawable.nissan,  "Abbosbek Abduvoxobov", false)));
        chats.add( new Chat(new Message(R.drawable.volkswagen,  "Muslim Saidov", true)));
        chats.add( new Chat( new Message(R.drawable.mercedes,  "Doston Ibroximov", false)));
        chats.add( new Chat(new Message(R.drawable.nissan,  "Abbosbek Abduvoxobov", false)));
        chats.add( new Chat(new Message(R.drawable.volkswagen,  "Muslim Saidov", true)));
        chats.add( new Chat( new Message(R.drawable.mercedes,  "Doston Ibroximov", false)));
        chats.add( new Chat(new Message(R.drawable.nissan,  "Abbosbek Abduvoxobov", false)));
        chats.add( new Chat(new Message(R.drawable.volkswagen,  "Muslim Saidov", true)));

        return chats;
    }
}