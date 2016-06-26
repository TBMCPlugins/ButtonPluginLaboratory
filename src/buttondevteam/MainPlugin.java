package buttondevteam;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import buttondevteam.alisolarflare.discordbot.DiscordSubPlugin;
import buttondevteam.alisolarflare.iiewar.IieWarSubPlugin;

public class MainPlugin extends JavaPlugin{
	private PluginDescriptionFile pdfFile;
	private Logger logger;
	private DiscordSubPlugin discordSubPlugin;
	private IieWarSubPlugin iieWarSubPlugin;
	public void onEnable(){
		//Logs "Plugin Enabled", registers commands
		pdfFile = getDescription();
		logger = getLogger();
		logger.info(pdfFile.getName() + " has been started (V." + pdfFile.getVersion()+ ").");
		
		registerSubPlugins();
		registerCommands();
		registerEvents();
				
		logger.info(pdfFile.getName() + " has been Enabled (V." + pdfFile.getVersion()+ ").");
	}
	public void onDisable(){
		logger.info(pdfFile.getName() + " has been Disabled (V." + pdfFile.getVersion()+ ").");
	}
	public void registerSubPlugins(){
		discordSubPlugin = new DiscordSubPlugin(this);
		iieWarSubPlugin = new IieWarSubPlugin(this);
		
		discordSubPlugin.register();
		iieWarSubPlugin.register();
	}
	public void registerCommands(){
		//Example command: getCommand("createShrine").setExecutor(new CreateShrine(this));
	}
	public void registerEvents(){		
		//EVENTS
	}
}
