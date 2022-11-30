# id 867200721 (Abrup Basin : Frozen River Bank), field 867200721
sm.lockInGameUI(True, False)
sm.removeAdditionalEffect()
sm.spawnNpc(9400582, 450, 355)
sm.showNpcSpecialActionByTemplateId(9400582, "summon", 0)
sm.spawnNpc(9400583, 620, 355)
sm.showNpcSpecialActionByTemplateId(9400583, "summon", 0)
sm.spawnNpc(9400585, 0, 355)
sm.showNpcSpecialActionByTemplateId(9400585, "summon", 0)
sm.spawnNpc(9400585, 60, 355)
sm.showNpcSpecialActionByTemplateId(9400585, "summon", 0)
sm.spawnNpc(9400585, 110, 355)
sm.showNpcSpecialActionByTemplateId(9400585, "summon", 0)
sm.spawnNpc(9400585, 700, 355)
sm.showNpcSpecialActionByTemplateId(9400585, "summon", 0)
sm.spawnNpc(9400585, 770, 355)
sm.showNpcSpecialActionByTemplateId(9400585, "summon", 0)
sm.spawnNpc(9400672, 500, 355)
sm.showNpcSpecialActionByTemplateId(9400672, "summon", 0)
sm.zoomCamera(1500, 2000, 1500, 550, 420)
sm.blind(False, 0, 0, 0, 0, 1000)
sm.sendDelay(1000)
sm.setSpeakerType(3)
sm.setParam(37)
sm.setColor(1)
sm.setInnerOverrideSpeakerTemplateID(9400582) # Cayne
sm.sendNext("#face0#Cayne Special Number 2: Horizon Divide! ")
sm.showNpcSpecialActionByTemplateId(9400582, "attack1", 0)
sm.sendDelay(300)
sm.showNpcSpecialActionByTemplateId(9400672, "die1", 0)
sm.showFieldEffect("Map/EffectPL.img/MainStream/Skuas/screenEff/finishAttack", 0)
sm.sendDelay(2000)
sm.playSound("PL_3min/CubeBreak", 100)
sm.setInnerOverrideSpeakerTemplateID(9400585) # Afinas Soldier
sm.sendNext("Yeah!!")
sm.setInnerOverrideSpeakerTemplateID(9400580) # Alika
sm.sendSay("#face0#Cayne, seriously... What is wrong with you? ")
sm.setInnerOverrideSpeakerTemplateID(9400583) # Gillie
sm.sendSay("#face0#Can't you see? He's trying to brighten up the mood! He's so considerate and awesome and... ")
sm.showEffect("Effect/OnUserEff.img/emotion/love", 0, 0, 0, 0, 18744121, 0, 0)
sm.sendSay("#face0#Ooh, Miss Alika, I envy you so much! ")
sm.sendDelay(1440)
sm.moveCamera(True, 0, 0, 0)
sm.lockInGameUI(False, True)
sm.createQuestWithQRValue(64006, "WC=6;k1=0;k2=0;k3=0;speed=20;man=200;prog=0;Pt=CaravanP1_chk13;Ec=14;weather=2;max=16;food=240")
sm.warp(867200500)