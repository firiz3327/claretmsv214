sm.setSpeakerID(9112044)
sm.setBoxChat(True)
sm.setColor(1)
sm.setSpeakerType(3)

sel = sm.sendNext("...? \r\n#L0#Dressing#l\r\n#L1#Style#l")
if sel == 0:
    sm.disposeAll()
    sm.openNpc(9112044, "dressShop")
elif sel == 1:
    sm.disposeAll()
    sm.openNpc(9112044, "EmiliaQuest")