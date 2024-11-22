![I Dream of Easy!](https://github.com/user-attachments/assets/4024f9ee-71d1-4506-b215-33ddd656509c)

### I Dream of Easy is a Slimefun Addon that implements workable community suggestions as well as other random tools and machines.

## How it works
> [!WARNING]
> ### Requires latest Slimefun and Java 21!
**Community-Driven Design**: This plugin tries to bring ideas from the Slimefun Discord community to life. Each feature has been developed based on user [#suggestions](https://discord.com/channels/565557184348422174/693130800853418055), creating a growing addon that evolves with player input. While some suggestions may not be possible, I do my best to find ways to bring similar ideas to life for everyone to enjoy.

>[!IMPORTANT]
> Some items have configuration options for Admins. I highly suggest looking over the `items.yml` once installed to see what kind of options are available. Since IDoE might not suit every server, be sure to configure the plugin to meet your specific needs!
<details>
<summary><h2>Special thanks to the people who made suggestions!</h2></summary>

> - **inaxtrawetrust** - "A machine that stops Radiation damage in an area" [Radiation Absorber]
>    - Note: This was also designed because of so many reports of Radiation griefing!
> - **林alguém林 有人** - "Biome finding compass a compass that points to the direction of a biome you choose on it, every biome has a different cost like xp or idk what item" [Biome Compass]
> - **Marvi444[Ger]** - "a player hopper. works like a normal hopper but it puts its items in your inventory instead when you stand under it" [Player Hopper],[Supply Hopper]
> - **JustAHuman** - "Create A Slime Totem of sorts that when constructed (if its a multiblock) or placed (if its a player head) inside of a slime chunk No slimes will spawn in it, could also have one that does the opposite and causes a chunk to spawn slimes" - [Mob Repeller]
>    - Note: I haven't added the second part of the suggestion, however I've extended the idea to other mobs!
> - **AverageUnusualUser** - "Shift + Right clicking while holding infused magnet will toggle "Shift" and "Always" mode, "shift" mode is the infused magnet we know, "always" mode will always attract nearby items without having to press shift as long as the infused magnet is in the inventory, or maybe made it into a separate item in a addon, could be usefull for clearing large area of items without having to slow down because of sneaking" [Magnetoid]
>   - Note: The Magnetoid was designed previously by me for STB. It's functionality compared to the Infused Magnet was too good to not re-design!
> - **deserdoo** - "Add a recipe for the 1.20 armor trims. Currently the only way to upgrade your armor to netherite is to find a netherite armor upgrade in a bastion chest. Add some way to craft the upgrade, maybe with magic stuff like a fire rune" [Trim Vault]
> - **oah** - "Ender talismans take up a ton of room in the enderchest, how about a 'multiEnderTalisman'?" [Idols]
> - **elitemastereric** - "A variant of the Industrial Miner, which targets all stone and dirt as well as ores. This would essentially allow it to act as a full quarry, which clears out an area until reaching bedrock." [Terrabore]
> - **hellex7769** - "What would be nice is to have a machine that can strip all wood types for automating other machines." [Electric Log Stripper]
> - **energized36** - "Add Electric Smokers and Blast Furnaces. (We have normal Electric Furnaces, why are Smokers and Blast Furnaces not a thing?)" [Electric Blast Furnace & Electric Smoker]
> - **nyctophilio01** - "Add a obsidian boat to extra utilities, crafted like a oak boat but use obsidian and 1 electric motor; this item would be used to traverse over lava eazy" [Lava Boat]
> - **cromecloridethecheese** - "Electric cable, that could damage players and mobs that touch it when powered. Recipe could be energy connector surrounded with chains." [Electric Cable]
> - **TheBusyBiscuit** - "An electric machine that automatically shears sheep in a small radius." [Electric Shearer]
> - **kohlth** - "chisel: right click any block with pillar/chiseled forms to swap between its chiseled, pillar, smooth, and normal forms (basically a portable stone cutter?)" [Chisel]
> - **TheBusyBiscuit** - "An Electric Explosive Pickaxe that consumes power instead of durability." [Electric Explosive Pickaxe/Shovel]
> - **bird** - "Potion of Bad Omen: Drink to acquire one level of Bad Omen. Could even require an ominous banner to craft. Useful for when there is no/inaccessible outpost and patrols are hard to come by." [Bad Omen Potion]
>    -  Note: I did not use the Ominous Banner as an ingrediant due to complications with banner "designing" for recipe usage.
> - **BurningBrimstone** - ""Creative Energy Source", "Creative Transmitter", and "Creative Capacitor" Items retrieved from /sf cheat that give "infinite" energy, gps complexity, and energy storage. Would be useful for testing. (Infinite probably being a convenient power of 2)" [Creative Transmitter/Capacitor/Generator]
>    -  Note: The word "infinite" isn't actually infinite, like BurningBrimstone mentions. This is simply a java limit!
> - **TheBusyBiscuit** - "An Electric Poison Extractor. You insert a glass bottle and something poisonous to get a vial/potion of poison. That "something" could be one of the following: 1 Posionous Potato, 1 Pufferfish, 2 Spider Eyes, 8 Rotten Flesh, 4 Mushrooms?" [Electric Poison Extractor]
> - **Monster_Engineer** - "Slime Bonemeal - a slimeball surrounded by bonemeal, when thrown onto a slime will increase its size." [Slime Meal]
> - **TheBusyBiscuit** - "What about an alarm clock or a timer item which you can right click to set the alarm..." [Alarm Clock]
>    -  Note: There's alot more to this suggestion including reminder text and a placeable version. Those will come in the future!
</details>

## Items
### Tools
- **Biome Compass**: A compass that points players toward the nearest biome of their choice. Default range: 100, configurable.
- **Jawn**: A specialized tool that allows you to break any head with a simple right-click.
- **Lava Boat**: A unique boat designed for navigating lava, allowing you to traverse molten environments efficiently.
- **Magnetoid**: An offhand device that attracts nearby items to itself, similarly to the Infused Magnet. Configurable radius.
- **Trim Vault**: A crafted block that players can place and break to obtain a Trim item. Includes Netherite Smithing template.
- **Wister Shears**: The Wister Shears can shear certain mobs and efficiently clear leaves from trees, grass, and other foliage. When used on a mob, it provides unique drops based on the creature.
- **Chisel**: A tool to Chisel certain blocks, changing their form instantly. Mostly based off Stone cutter recipes.
- **Electric Pickaxe and Shovel**: Electric versions of the Explosive Pickaxe and Shovel. Stops working if there is no charge.
- **Slime Meal**: A Slime's favorite food! Use this on slimes to grow them instantly. Can be used to make super slimes.
- **Alarm Clock**: A simple timer that will "ding" when the set timer is up. Toggle alarm mode for continuous dings.
- **Bad Omen Potion**: A craftable potion that gives the Bad Omen effect. Useful if Pillager Outposts aren't reachable.
- **Tome of Enlightenment**: An easy-to-craft tool that instantly unlocks a random research using your available XP. Great for players who don't care about XP costs and just want to speed run research unlocking.
### Idols
Idols are powerful, combined versions of Slimefun talismans that apply the same effects as the talismans used to create them. They only work from your inventory—Ender Chest compatibility isn’t available yet! Idols are fireproof and never consumed.
- **Flameheart**: The Flameheart Idol provides benefits in combat and fire-related situations. When the player is in contact with lava or fire, there is a 20% chance to gain Fire Resistance for 10 seconds. Additionally, when attacked by non-player entities, the Flameheart Idol offers a 20% chance to grant Strength III for 10 seconds, and a 30% chance to grant Regeneration I for 5 seconds.
- **Terran**: The Terran Idol offers benefits when breaking blocks and defeating mobs. When breaking ores or crops, there is a 20% chance to double the drops. Additionally, when defeating mobs, the Terran Idol has a 20% chance to can double the loot dropped, and takes Looting into account! The idol also has a 50% chance to grant Haste II for 5 seconds when mining.
- **Torrent**: The Torrent Idol grants an array of protective and enhancing abilities. Players have a 20% chance to gain Water Breathing when they start to drown, a 75% chance to absorb fall damage, a 60% chance to reflect incoming projectiles, and a 60% chance to receive a Speed boost for a short duration when sprinting.
- **Divine**: The Divine Idol grants enhanced enchanting, amplifies experience gain, and can protect tools and armor. Players have an 80% chance to modify enchantments during the enchanting process, a 20% chance that it can grant the coveted Fortune enchantment, a 20% chance to double the amount of experience received, and a 20% chance to protect your tools and armor from breaking.
### Machines
- **Multi-block Machine: Terrabore**: The Terrabore is a variant of the Industrial Miner. It works in a 7x7 radius and mines everything. Requires basic combustibles like coal or wood as fuel.
- **Multi-block Machine: Advanced Terrabore**: The Advanced Terrabore is a variant of the Terrabore. It works in an 11x11 radius and mines everything but ores. Requires lava, oil, or fuel.
- **Multi-block Machine: Elite Terrabore**: The Elite Terrabore is a variant of the Terrabore. It works in a 21x21 radius and mines everything. Requires uranium as a fuel source.
- **Electric Blast Furnace**: An electric version of the Blast Furnace.
- **Electric Log Stripper**: Transforms logs into stripped wood.
- **Electric Smoker**: An electric version of the Smoker.
- **Electric Shearer**: A machine that automatically shears sheep nearby. Range: 4
- **Player Hopper**: A convenient drop-off point for players to store items easily. Standing on top of the Player Hopper will pull items out of your inventory, excluding armor and offhand items.
- **Supply Hopper**: A convenient pickup point for players to retrieve items easily. Standing under the Supply Hopper will put items from the hopper into your inventory.
- **Electric Cable**: A cable that deals damage to players and mobs upon contact when powered.
- **Radiation Absorber**: Protect yourself from harmful radiation without the need of a Hazmat suit. This device absorbs radiation in a radius, granting players temporary immunity while powered.
- **Stack Dispenser**: A dispenser that tries to automatically dispenses items in stacks.
- **Mob Repellers**: Electric devices that prevent specific mobs from spawning in a chunk. Mobs include Bat, Creeper, Enderman, Skeleton, Slime, Spider, Witch, Zombie, and Zombie Villager.
### Admin/Cheated Items
- **Creative Transmitter**: A creative GPS transmitter that provides almost infinite complexity.
- **Creative Capacitor**: A creative capacitor that holds almost infinite energy.
- **Creative Generator**: A creative generator produces almost infinite energy.


## :headphones: Discord Support Server
> [!CAUTION]
> For bug reports, please use the [Issue Tracker](https://github.com/Bunnky/IDreamOfEasy/issues) rather than Discord.
>
> ### **Please contact or ping "Bunnky" in discord for live support! Please use the [#addons](https://discord.com/channels/565557184348422174/624966637816381440) channel**

<p align="center">
  <a href="https://discord.gg/slimefun">
    <img src="https://discordapp.com/api/guilds/565557184348422174/widget.png?style=banner3" alt="Discord Invite"/>
  </a>
</p>
