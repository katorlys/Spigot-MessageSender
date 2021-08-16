# Spigot-MessageSender
[![License](https://img.shields.io/badge/license-GPLv3-blue?style=for-the-badge)](https://www.gnu.org/licenses/gpl-3.0.html) ![Pull Requests](https://img.shields.io/github/issues-pr-closed/katorlys/Spigot-MessageSender?style=for-the-badge) ![Issues](https://img.shields.io/github/issues-closed/katorlys/Spigot-MessageSender?style=for-the-badge)

## Introduction
Tired of writing message-sending codes every time you want to send information?<br>
This code allows you to only code for one line to send messages and broadcasts without polluting the console.<br>

PS: Supports color codes.<br>

## Usage
**Replace "&" with "§" to fix color messages**
```java
MessageSender.Color(String string);
```
**Send message to a player**
```java
MessageSender.sendMessage(Player player, String message);
```
**Send message to all online players**
```java
MessageSender.broadcastMessage(String message);
```
**Send message to console and all online players**
```java
MessageSender.broadcastMessageAll(String message);
```
**Send title to a player**
```java
MessageSender.sendTitle(Player player, String title, String subtitle);
```
**Send title to all online players**
```java
MessageSender.broadcastTitle(String title, String subtitle);
```

There are also Javadoc comments before every method.<br>
