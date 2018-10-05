/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mami
 */
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class CommandHub extends Command {
 public CommandHub(){
  //コマンドとパーミッション
  super("matumo","com.matumo");
 }

 public void execute(CommandSender sender, String[] arg){
  //senderは実行者
 //ProxiedPlayer取得
  ProxiedPlayer p = (ProxiedPlayer) sender;
 //argはコマンド引数
 }

}
