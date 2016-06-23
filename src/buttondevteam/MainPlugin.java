package buttondevteam;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin{
	private PluginDescriptionFile pdfFile;
	private Logger logger;
	
	public void onEnable(){
		//Logs "Plugin Enabled", registers commands
		pdfFile = getDescription();
		logger = getLogger();
		logger.info(pdfFile.getName() + " has been started (V." + pdfFile.getVersion()+ ").");
				
		registerCommands();
		registerEvents();
				
		logger.info(pdfFile.getName() + " has been Enabled (V." + pdfFile.getVersion()+ ").");
	}
	public void onDisable(){
		logger.info(pdfFile.getName() + " has been Disabled (V." + pdfFile.getVersion()+ ").");
	}
	public void registerCommands(){
		//Example command: getCommand("createShrine").setExecutor(new CreateShrine(this));
	}
	public void registerEvents(){
		//Example INIT: midnightListener = new MidnightListener(this);
		//Example Event: getServer().getPluginManager().registerEvents(midnightListener, this);
		
		//INIT
		
		//EVENTS
	}
}
