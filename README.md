# Spigot-MessageSender
[![License](https://img.shields.io/badge/license-GPLv3-blue?style=flat-square)](https://www.gnu.org/licenses/gpl-3.0.html) [![Pull Requests](https://img.shields.io/github/issues-pr-closed/katorlys/Spigot-MessageSender?style=flat-square)](https://github.com/katorlys/Spigot-MessageSender/pulls) [![Issues](https://img.shields.io/github/issues-closed/katorlys/Spigot-MessageSender?style=flat-square)](https://github.com/katorlys/Spigot-MessageSender/issues) [![Lines](https://img.shields.io/tokei/lines/github/katorlys/Spigot-MessageSender?style=flat-square)](https://github.com/katorlys/Spigot-MessageSender)

## Introduction
Tired of writing message-sending codes every time you want to send information?  
This code allows you to only code for one line to send messages and broadcasts without polluting the console.  

PS: Supports color codes.  

## Usage
**Replace "&" with "§" to fix color messages**  
If you don't want "&" to be replaced, please use "&&".
```java
Messager.Color(String string);
```
**Send message to a player**
```java
Messager.sendMessage(Player player, String message);
```
**Send message to a command sender**
```java
Messager.senderMessage(Sender sender, String message);
```
**Send message to all online players**
```java
Messager.broadcastMessage(String message);
```
**Send message to console and all online players**
```java
Messager.broadcastMessageAll(String message);
```
**Send title to a player**
```java
Messager.sendTitle(Player player, String title, String subtitle);
```
**Send title to all online players**
```java
Messager.broadcastTitle(String title, String subtitle);
```

There are also Javadoc comments before every method.  
