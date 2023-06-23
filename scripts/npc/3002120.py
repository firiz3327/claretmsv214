# sm.disposeAll()
# sm.openNpc(3002120, "watermelon_out")

shopItems = [
    [ # scroll
        [2049419, 50000, 100], # potential 100%
        [2048305, 250000, 100], # bonusPotential 70%
        [2048306, 450000, 100], # bonusPotential 100%
        [2530000, 70000, 100], # lucky
        [2532000, 120000, 100], # safety
        [2531000, 200000, 100], # protect
        [2049100, 20000, 100], # chaos scroll
        [2048079, 100000, 100], # pet att+2
        [2048080, 100000, 100], # pet ma+2
        [2048716, 200000, 100], # Powerful Rebirth Flame
        [2048717, 1000000, 100], # Eternal Rebirth Flame
    ],
    [ # Game Enchanting
        [5133000, 1000, 100], # Buff Freezer
        [5072000, 2000, 100], # Megaphone
        [5077000, 10000, 100], # Triple Megaphone
        [5076000, 10000, 100], # Item Megaphone
        [2434327, 10000, 100], # Dummy サンドバック
        [2434326, 15000, 100], # Dummy サンドバック
        [2434325, 20000, 100], # Dummy サンドバック
        [5062400, 10000, 100], # Fusion Anvil
        [5062402, 12000, 100], # Medal Fusion Anvil
    ],
    [ # Enhance Items
        [5360042, 100000, 24], # drop%
        [5211046, 100000, 24], # exp%
        [5060048, 100000, 24], # meso%
        [5680047, 300000, 24], # pet vac
        # [1122303, 1000000],
        # [1113171, 1000000],
        # [2434039, 5000000], # Outlow Heart, Battle Roid
        # [2434038, 5000000], # Outlow Heart, Battle Roid
        # ↑ アンドロイドは強化していくシステムにしたいかも？
    ]
]
shopCategory = ["Scroll", "Game Enchanting", "Enhance Items"]

text = "Select Shop: \r\n"
for x in range(len(shopCategory)):
    text += "#L{0}##b{1}#k#l\r\n".format(x, shopCategory[x])
sel1 = sm.sendNext(text)

text = "Shop Items: \r\n"
for x in range(len(shopItems[sel1])):
    text += "#L{0}##b#v{1}# #z{1}# ({2} NX)#k#l\r\n"\
        .format(x, shopItems[sel1][x][0], shopItems[sel1][x][1])
sel2 = sm.sendNext(text)

enhancedItem = sel1 == 2
if enhancedItem: # Enhanced Items
    text = "How many hours do you want to rent?\r\n#b{0} NX / h#k".format(shopItems[sel1][x][1])
else:
    text = "How many products will you purchase?"
maxCount = shopItems[sel1][sel2][2]
count = 1
if maxCount > 1:
    count = sm.sendAskNumber(text, 1, 1, maxCount)
buyItemId = shopItems[sel1][sel2][0]
requiredNX = shopItems[sel1][sel2][1] * count
if (sm.getNX() < requiredNX):
    sm.sendNext("Seems you don't have enough NX to pay.\r\n\r\n#bYour NX\t\t\t: {0}\r\nRequired NX\t: {1}#k".format(requiredNX - sm.getNX(), requiredNX))
else:
    if sm.sendAskYesNo(
            "#b#v{0}# #z{0}##k\r\n\r\n#r#eReuired {1} NX ({2} Amount)#n".format(buyItemId, requiredNX, count)
    ):
        sm.deductNX(requiredNX)
        if enhancedItem:
            sm.giveItemWithExpireDate(buyItemId, 1, False, 60 * count)
        else:
            sm.giveItem(buyItemId, count)
        sm.sendSayOkay("Thanks you ~~")