# ルーターの設定を行う
＜コマンド履歴＞
```
Router#conf t
Enter configuration commands, one per line.  End with CNTL/Z.

Router(config)#int f0/0
Router(config-if)#ip address 192.168.10.1 2550.255.255.0
Router(config-if)#no shutdown

Router(config)#router rip
Router(config-router)#network 192.168.1.0
```
