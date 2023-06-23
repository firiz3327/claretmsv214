if sm.getFieldID() != 910000000 and sm.sendAskYesNo("Do you want to move to Home?"):
    sm.setReturnField()
    sm.warp(800000000, 1)