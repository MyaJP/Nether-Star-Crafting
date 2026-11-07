# Nether Star Crafting

Adds a new intermediate item, the **Netherstar Shard**, and a crafting recipe for the **Nether Star**.
The Wither still drops the Nether Star as usual.

- CurseForge: <https://www.curseforge.com/minecraft/mc-mods/nether-star-crafting>
- Modrinth: <https://modrinth.com/mod/nether-star-crafting>
- Horizon version: <https://github.com/MyaJP/Nether-Star-Crafting-Horizon>

## Recipes

**Netherstar Shard**

|               |               |               |
|:-------------:|:-------------:|:-------------:|
| Diamond       | Gold Ingot    | Diamond       |
| Gold Ingot    | Block of Iron | Gold Ingot    |
| Diamond       | Gold Ingot    | Diamond       |

**Nether Star**

|                  |                  |                  |
|:----------------:|:----------------:|:----------------:|
|                  | Netherstar Shard |                  |
| Netherstar Shard | Ghast Tear       | Netherstar Shard |
|                  | Netherstar Shard |                  |

## Versions

| Folder            | Loader   | Minecraft | Needs           |
|-------------------|----------|-----------|-----------------|
| `fabric-1.20.1`   | Fabric   | 1.20.1    | Fabric API      |
| `forge-1.20.1`    | Forge    | 1.20.1    |                 |
| `fabric-1.21.1`   | Fabric   | 1.21.1    | Fabric API      |
| `neoforge-1.21.1` | NeoForge | 1.21.1    |                 |

Shared textures, models and translations are in `common/`; recipes are in `common-1.20.1/` and `common-1.21.1/` (the recipe format changed between them).
The mod version is in `VERSION`.

## Build

Each folder is its own Gradle project:

```sh
cd fabric-1.21.1
./gradlew build
```

The jar is written to `build/libs/`. GitHub Actions builds all four on every push and attaches them to each release.

---

# Nether Star Crafting（日本語）

新しい中間素材「**ネザースターの欠片**」と、**ネザースター**のクラフトレシピを追加します。ウィザーからのドロップはそのままです。

- **ネザースターの欠片**：四隅にダイヤモンド、上下左右に金インゴット、中央に鉄ブロック
- **ネザースター**：上下左右にネザースターの欠片、中央にガストの涙

Fabric版には Fabric API が必要です。

## License

MIT © Mya
