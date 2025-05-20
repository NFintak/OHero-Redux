## OHero Redux

Text adventure based on the premise outlined by the OHero project

### Minimum Viable Product

* Interactions for the player and NPCs
* Player choices that affect stats and interaction options
* Stats applied within interactions
* Functioning inventory
* Persistence

### Specs

* Display class
  * Text to be read by player, includes menus
* Character classes
  * Should use abstraction, must include player and NPCs (enemies, bosses, etc)
* Game loop
  * Must continue running until player exits or game ends
* Inventory/Collections
  * Track items the player picks up, stat/exp changes based on items and encounters
* Encounters/Randomization
  * Use 'dice' and other randomization tools to initialize stats, determine encounters, etc.