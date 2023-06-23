from net.swordie.ms.constants import BossConstants
from net.swordie.ms.enums import ObtacleAtomEnum

sm.createClock(BossConstants.MAGNUS_TIME)
magnus = sm.spawnMob(8880010, 1900, -1347, False, 6000000000)

sm.invokeAtFixedRate(250, 250, 0, "magnusMobZoneDamageBoost", magnus.getObjectId())

sm.invokeAtFixedRate(250, BossConstants.MAGNUS_GREEN_ATOM_EXECUTION_DELAY, 0,
                     "createObstacleAtom", ObtacleAtomEnum.GreenMeteor, 1, BossConstants.MAGNUS_GREEN_ATOM_DAMAGE, BossConstants.MAGNUS_OBSTACLE_ATOM_VELOCITY_MIN, BossConstants.MAGNUS_OBSTACLE_ATOM_VELOCITY_MAX, 0, BossConstants.MAGNUS_GREEN_ATOM_AMOUNT, BossConstants.MAGNUS_GREEN_ATOM_PROP)

sm.invokeAtFixedRate(500, BossConstants.MAGNUS_BLUE_ATOM_EXECUTION_DELAY, 0,
                     "createObstacleAtom", ObtacleAtomEnum.BlueMeteor, 1, BossConstants.MAGNUS_BLUE_ATOM_DAMAGE, BossConstants.MAGNUS_OBSTACLE_ATOM_VELOCITY_MIN, BossConstants.MAGNUS_OBSTACLE_ATOM_VELOCITY_MAX, 0, BossConstants.MAGNUS_BLUE_ATOM_AMOUNT, BossConstants.MAGNUS_BLUE_ATOM_PROP)

sm.invokeAtFixedRate(750, BossConstants.MAGNUS_PURPLE_ATOM_EXECUTION_DELAY, 0,
                     "createObstacleAtom", ObtacleAtomEnum.PurpleMeteor, 1, BossConstants.MAGNUS_PURPLE_ATOM_DAMAGE, BossConstants.MAGNUS_OBSTACLE_ATOM_VELOCITY_MIN, BossConstants.MAGNUS_OBSTACLE_ATOM_VELOCITY_MAX, 0, BossConstants.MAGNUS_PURPLE_ATOM_AMOUNT, BossConstants.MAGNUS_PURPLE_ATOM_PROP)
