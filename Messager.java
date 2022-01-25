import java.util.Objects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Messager {
    /**
     * Replace "&" with "§" to fix color messages.
     * 
     * @param string
     * @return
     */
    public static String Color(String string) {
        return Objects.requireNonNull(string).replace("&", "§").replace("§§", "&");
    }

    /**
     * Send message to a player.
     * 
     * @param player
     * @param message
     */
    public static void sendMessage(Player player, String message) {
        player.sendMessage(Messager.Color(message));
    }

    /**
     * Send message to a command sender.
     *
     */
    public static void senderMessage(Sender sender, String message) {
        sender.sendMessage(Messager.Color(message));
    }

    /**
     * Send message to all online players.
     * 
     * @param message
     */
    public static void broadcastMessage(String message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(Messager.Color(message));
        }
    }

    /**
     * Send message to console and all online players.
     * 
     * @param message
     */
    public static void broadcastMessageAll(String message) {
        Bukkit.broadcastMessage(Messager.Color(message));
    }

    /**
     * Send title to a player.
     * 
     * @param player
     * @param title
     * @param subtitle
     */
    public static void sendTitle(Player player, String title, String subtitle) {
        player.sendTitle(Messager.Color(title), Messager.Color(subtitle), 10, 40, 20); // Show title 2s
    }

    /**
     * Send title to all online players.
     * 
     * @param title
     * @param subtitle
     */
    public static void broadcastTitle(String title, String subtitle) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendTitle(Messager.Color(title), Messager.Color(subtitle), 10, 40, 20); // Show title 2s
        }
    }
}