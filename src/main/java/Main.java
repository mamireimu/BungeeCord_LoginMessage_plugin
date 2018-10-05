/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import net.md_5.bungee.api.plugin.Plugin;

/**
 *
 * @author mami
 */
public class Main extends Plugin {
 @Override
 public void onEnable(){
//イベント登録
 getProxy().getPluginManager().registerListener(this, new Event());
//コマンド登録
 getProxy().getPluginManager().registerCommand(this, new CommandHub());
//ロード時メッセージ
 getLogger().info("ロードしたよ！");
 }

}

