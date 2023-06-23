# Created by MechAviv
# Map ID :: 100000000
# NPC ID :: 9111063
# Heart of Zipangu

sm.setSpeakerID(0)
sm.flipSpeaker()
sm.flipDialoguePlayerAsSpeaker()
sm.setBoxChat()
sm.setColor(1)
sm.setSpeakerType(3)

rf = sm.getReturnField()
sel = sm.sendNext("\r\n\r\n#L0# Go back to #m" + str(rf) + "##l")
if sel == 0:
    sm.warp(rf)