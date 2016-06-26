package buttondevteam.alisolarflare.discordbot;

import java.util.logging.Level;

import buttondevteam.MainPlugin;

public class DiscordSubPlugin {
	private MainPlugin plugin;

	public DiscordSubPlugin(MainPlugin plugin){
		this.plugin = plugin;
	}
	public void register(){
		registerEvents();
		registerCommands();
		plugin.getLogger().log(Level.INFO, "Discord Sub Plugin Registered!");
	}
	private void registerEvents() {
		
	}

	private void registerCommands() {
		// TODO Auto-generated method stub
		
	}
}
