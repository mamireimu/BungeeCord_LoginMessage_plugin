/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mami
 */
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.api.event.PostLoginEvent;

public class Event implements Listener {

 @EventHandler
 public void ServerConnectedEvent(PostLoginEvent e) { //ログイン時の例
  //何かの処理
        event.getPlayer().sendMessage("niconico");
 }

}
