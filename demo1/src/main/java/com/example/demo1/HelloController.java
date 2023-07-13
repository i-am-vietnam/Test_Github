package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class HelloController {
    private static final String channel = "2002";
    @FXML
    private TextArea HienThi;

    @FXML
    private TextField ONhap;

    @FXML
    private Button btn;

    @FXML
    private Jedis jedisP = new Jedis();
    @FXML
    private Jedis jedisS;
    @FXML
    private JedisPubSub jedisPubSub;

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }

    public void sendMessage() {
        jedisP.publish(channel,"Mình nè: "+ HienThi.getText());
    }

}