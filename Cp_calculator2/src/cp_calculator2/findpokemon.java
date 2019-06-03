/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_calculator2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patrickbruus
 */
public class findpokemon {
    public static double[] finding(String namelowcase){
        String [][] pokestat = {{"118","111","128","1","Bulbasaur"},{"151","143","155","2","Ivysaur"},{"198","189","190","3","Venusaur"},{"116","93","118","4","Charmander"},{"158","126","151","5","Charmeleon"},{"223","173","186","6","Charizard"},{"94","121","127","7","Squirtle"},{"126","155","153","8","Wartortle"},{"171","207","188","9","Blastoise"},{"55","55","128","10","Caterpie"},{"45","80","137","11","Metapod"},{"167","137","155","12","Butterfree"},{"63","50","120","13","Weedle"},{"46","75","128","14","Kakuna"},{"169","130","163","15","Beedrill"},{"85","73","120","16","Pidgey"},{"117","105","160","17","Pidgeotto"},{"166","154","195","18","Pidgeot"},{"103","70","102","form","Alola","19","Rattata"},{"103","70","102","form","Normal","19","Rattata"},{"135","154","181","form","Alola","20","Raticate"},{"161","139","146","form","Normal","20","Raticate"},{"112","60","120","21","Spearow"},{"182","133","163","22","Fearow"},{"110","97","111","23","Ekans"},{"167","153","155","24","Arbok"},{"112","96","111","25","Pikachu"},{"201","154","155","form","Alola","26","Raichu"},{"193","151","155","form","Normal","26","Raichu"},{"125","129","137","form","Alola","27","Sandshrew"},{"126","120","137","form","Normal","27","Sandshrew"},{"177","195","181","form","Alola","28","Sandslash"},{"182","175","181","form","Normal","28","Sandslash"},{"86","89","146","29","Nidoran♀"},{"117","120","172","30","Nidorina"},{"180","173","207","31","Nidoqueen"},{"105","76","130","32","Nidoran♂"},{"137","111","156","33","Nidorino"},{"204","156","191","34","Nidoking"},{"107","108","172","35","Clefairy"},{"178","162","216","36","Clefable"},{"96","109","116","form","Alola","37","Vulpix"},{"96","109","116","form","Normal","37","Vulpix"},{"170","193","177","form","Alola","38","Ninetales"},{"169","190","177","form","Normal","38","Ninetales"},{"80","41","251","39","Jigglypuff"},{"156","90","295","40","Wigglytuff"},{"83","73","120","41","Zubat"},{"161","150","181","42","Golbat"},{"131","112","128","43","Oddish"},{"153","136","155","44","Gloom"},{"202","167","181","45","Vileplume"},{"121","99","111","46","Paras"},{"165","146","155","47","Parasect"},{"100","100","155","48","Venonat"},{"179","143","172","49","Venomoth"},{"108","81","67","form","Alola","50","Diglett"},{"109","78","67","form","Normal","50","Diglett"},{"201","142","111","form","Alola","51","Dugtrio"},{"167","136","111","form","Normal","51","Dugtrio"},{"99","78","120","form","Alola","52","Meowth"},{"92","78","120","form","Normal","52","Meowth"},{"158","136","163","form","Alola","53","Persian"},{"150","136","163","form","Normal","53","Persian"},{"122","95","137","54","Psyduck"},{"191","162","190","55","Golduck"},{"148","82","120","56","Mankey"},{"207","138","163","57","Primeape"},{"136","93","146","58","Growlithe"},{"227","166","207","59","Arcanine"},{"101","82","120","60","Poliwag"},{"130","123","163","61","Poliwhirl"},{"182","184","207","62","Poliwrath"},{"195","82","93","63","Abra"},{"232","117","120","64","Kadabra"},{"271","167","146","65","Alakazam"},{"137","82","172","66","Machop"},{"177","125","190","67","Machoke"},{"234","159","207","68","Machamp"},{"139","61","137","69","Bellsprout"},{"172","92","163","70","Weepinbell"},{"207","135","190","71","Victreebel"},{"97","149","120","72","Tentacool"},{"166","209","190","73","Tentacruel"},{"132","132","120","form","Alola","74","Geodude"},{"132","132","120","form","Normal","74","Geodude"},{"164","164","146","form","Alola","75","Graveler"},{"164","164","146","form","Normal","75","Graveler"},{"211","198","190","form","Alola","76","Golem"},{"211","198","190","form","Normal","76","Golem"},{"170","127","137","77","Ponyta"},{"207","162","163","78","Rapidash"},{"109","98","207","79","Slowpoke"},{"177","180","216","80","Slowbro"},{"165","121","93","81","Magnemite"},{"223","169","137","82","Magneton"},{"124","115","141","83","Farfetch’d"},{"158","83","111","84","Doduo"},{"218","140","155","85","Dodrio"},{"85","121","163","86","Seel"},{"139","177","207","87","Dewgong"},{"135","90","190","form","Alola","88","Grimer"},{"135","90","190","form","Normal","88","Grimer"},{"190","172","233","form","Alola","89","Muk"},{"190","172","233","form","Normal","89","Muk"},{"116","134","102","90","Shellder"},{"186","256","137","91","Cloyster"},{"186","67","102","92","Gastly"},{"223","107","128","93","Haunter"},{"261","149","155","94","Gengar"},{"85","232","111","95","Onix"},{"89","136","155","96","Drowzee"},{"144","193","198","97","Hypno"},{"181","124","102","98","Krabby"},{"240","181","146","99","Kingler"},{"109","111","120","100","Voltorb"},{"173","173","155","101","Electrode"},{"107","125","155","102","Exeggcute"},{"230","153","216","form","Alola","103","Exeggutor"},{"233","149","216","form","Normal","103","Exeggutor"},{"90","144","137","104","Cubone"},{"144","186","155","form","Alola","105","Marowak"},{"144","186","155","form","Normal","105","Marowak"},{"224","181","137","106","Hitmonlee"},{"193","197","137","107","Hitmonchan"},{"108","137","207","108","Lickitung"},{"119","141","120","109","Koffing"},{"174","197","163","110","Weezing"},{"140","127","190","111","Rhyhorn"},{"222","171","233","112","Rhydon"},{"60","128","487","113","Chansey"},{"183","169","163","114","Tangela"},{"181","165","233","115","Kangaskhan"},{"129","103","102","116","Horsea"},{"187","156","146","117","Seadra"},{"123","110","128","118","Goldeen"},{"175","147","190","119","Seaking"},{"137","112","102","120","Staryu"},{"210","184","155","121","Starmie"},{"192","205","120","122","Mr. Mime"},{"218","170","172","123","Scyther"},{"223","151","163","124","Jynx"},{"198","158","163","125","Electabuzz"},{"206","154","163","126","Magmar"},{"238","182","163","127","Pinsir"},{"198","183","181","128","Tauros"},{"29","85","85","129","Magikarp"},{"237","186","216","130","Gyarados"},{"165","174","277","131","Lapras"},{"91","91","134","132","Ditto"},{"104","114","146","133","Eevee"},{"205","161","277","134","Vaporeon"},{"232","182","163","135","Jolteon"},{"246","179","163","136","Flareon"},{"153","136","163","137","Porygon"},{"155","153","111","138","Omanyte"},{"207","201","172","139","Omastar"},{"148","140","102","140","Kabuto"},{"220","186","155","141","Kabutops"},{"221","159","190","142","Aerodactyl"},{"190","169","330","143","Snorlax"},{"192","236","207","144","Articuno"},{"253","185","207","145","Zapdos"},{"251","181","207","146","Moltres"},{"119","91","121","147","Dratini"},{"163","135","156","148","Dragonair"},{"263","198","209","149","Dragonite"},{"300","182","214","150","Mewtwo"},{"210","210","225","151","Mew"},{"92","122","128","152","Chikorita"},{"122","155","155","153","Bayleef"},{"168","202","190","154","Meganium"},{"116","93","118","155","Cyndaquil"},{"158","126","151","156","Quilava"},{"223","173","186","157","Typhlosion"},{"117","109","137","158","Totodile"},{"150","142","163","159","Croconaw"},{"205","188","198","160","Feraligatr"},{"79","73","111","161","Sentret"},{"148","125","198","162","Furret"},{"67","88","155","163","Hoothoot"},{"145","156","225","164","Noctowl"},{"72","118","120","165","Ledyba"},{"107","179","146","166","Ledian"},{"105","73","120","167","Spinarak"},{"161","124","172","168","Ariados"},{"194","178","198","169","Crobat"},{"106","97","181","170","Chinchou"},{"146","137","268","171","Lanturn"},{"77","53","85","172","Pichu"},{"75","79","137","173","Cleffa"},{"69","32","207","174","Igglybuff"},{"67","116","111","175","Togepi"},{"139","181","146","176","Togetic"},{"134","89","120","177","Natu"},{"192","146","163","178","Xatu"},{"114","79","146","179","Mareep"},{"145","109","172","180","Flaaffy"},{"211","169","207","181","Ampharos"},{"169","186","181","182","Bellossom"},{"37","93","172","183","Marill"},{"112","152","225","184","Azumarill"},{"167","176","172","185","Sudowoodo"},{"174","179","207","186","Politoed"},{"67","94","111","187","Hoppip"},{"91","120","146","188","Skiploom"},{"118","183","181","189","Jumpluff"},{"136","112","146","190","Aipom"},{"55","55","102","191","Sunkern"},{"185","135","181","192","Sunflora"},{"154","94","163","193","Yanma"},{"75","66","146","194","Wooper"},{"152","143","216","195","Quagsire"},{"261","175","163","196","Espeon"},{"126","240","216","197","Umbreon"},{"175","87","155","198","Murkrow"},{"177","180","216","199","Slowking"},{"167","154","155","200","Misdreavus"},{"136","91","134","201","Unown"},{"60","106","382","202","Wobbuffet"},{"182","133","172","203","Girafarig"},{"108","122","137","204","Pineco"},{"161","205","181","205","Forretress"},{"131","128","225","206","Dunsparce"},{"143","184","163","207","Gligar"},{"148","272","181","208","Steelix"},{"137","85","155","209","Snubbull"},{"212","131","207","210","Granbull"},{"184","138","163","211","Qwilfish"},{"236","181","172","212","Scizor"},{"17","396","85","213","Shuckle"},{"234","179","190","214","Heracross"},{"189","146","146","215","Sneasel"},{"142","93","155","216","Teddiursa"},{"236","144","207","217","Ursaring"},{"118","71","120","218","Slugma"},{"139","191","137","219","Magcargo"},{"90","69","137","220","Swinub"},{"181","138","225","221","Piloswine"},{"118","156","146","222","Corsola"},{"127","69","111","223","Remoraid"},{"197","141","181","224","Octillery"},{"128","90","128","225","Delibird"},{"148","226","163","226","Mantine"},{"148","226","163","227","Skarmory"},{"152","83","128","228","Houndour"},{"224","144","181","229","Houndoom"},{"194","194","181","230","Kingdra"},{"107","98","207","231","Phanpy"},{"214","185","207","232","Donphan"},{"198","180","198","233","Porygon2"},{"192","131","177","234","Stantler"},{"40","83","146","235","Smeargle"},{"64","64","111","236","Tyrogue"},{"173","207","137","237","Hitmontop"},{"153","91","128","238","Smoochum"},{"135","101","128","239","Elekid"},{"151","99","128","240","Magby"},{"157","193","216","241","Miltank"},{"129","169","496","242","Blissey"},{"241","195","207","243","Raikou"},{"235","171","251","244","Entei"},{"180","235","225","245","Suicune"},{"115","93","137","246","Larvitar"},{"155","133","172","247","Pupitar"},{"251","207","225","248","Tyranitar"},{"193","310","235","249","Lugia"},{"239","244","214","250","Ho-Oh"},{"210","210","225","251","Celebi"},{"124","94","120","252","Treecko"},{"172","120","137","253","Grovyle"},{"223","169","172","254","Sceptile"},{"130","87","128","255","Torchic"},{"163","115","155","256","Combusken"},{"240","141","190","257","Blaziken"},{"126","93","137","258","Mudkip"},{"156","133","172","259","Marshtomp"},{"208","175","225","260","Swampert"},{"96","61","111","261","Poochyena"},{"171","132","172","262","Mightyena"},{"58","80","116","263","Zigzagoon"},{"142","128","186","264","Linoone"},{"75","59","128","265","Wurmple"},{"60","77","137","266","Silcoon"},{"189","98","155","267","Beautifly"},{"60","77","137","268","Cascoon"},{"98","162","155","269","Dustox"},{"71","77","120","270","Lotad"},{"112","119","155","271","Lombre"},{"173","176","190","272","Ludicolo"},{"71","77","120","273","Seedot"},{"134","78","172","274","Nuzleaf"},{"200","121","207","275","Shiftry"},{"106","61","120","276","Taillow"},{"185","124","155","277","Swellow"},{"106","61","120","278","Wingull"},{"175","174","155","279","Pelipper"},{"79","59","99","280","Ralts"},{"117","90","116","281","Kirlia"},{"237","195","169","282","Gardevoir"},{"93","87","120","283","Surskit"},{"192","150","172","284","Masquerain"},{"74","110","155","285","Shroomish"},{"241","144","155","286","Breloom"},{"104","92","155","287","Slakoth"},{"159","145","190","288","Vigoroth"},{"290","166","284","289","Slaking"},{"80","126","104","290","Nincada"},{"199","112","156","291","Ninjask"},{"153","73","1","292","Shedinja"},{"92","42","162","293","Whismur"},{"134","81","197","294","Loudred"},{"179","137","232","295","Exploud"},{"99","54","176","296","Makuhita"},{"209","114","302","297","Hariyama"},{"36","71","137","298","Azurill"},{"82","215","102","299","Nosepass"},{"84","79","137","300","Skitty"},{"132","127","172","301","Delcatty"},{"141","136","137","302","Sableye"},{"155","141","137","303","Mawile"},{"121","141","137","304","Aron"},{"158","198","155","305","Lairon"},{"198","257","172","306","Aggron"},{"78","107","102","307","Meditite"},{"121","152","155","308","Medicham"},{"123","78","120","309","Electrike"},{"215","127","172","310","Manectric"},{"167","129","155","311","Plusle"},{"147","150","155","312","Minun"},{"143","166","163","313","Volbeat"},{"143","166","163","314","Illumise"},{"186","131","137","315","Roselia"},{"80","99","172","316","Gulpin"},{"140","159","225","317","Swalot"},{"171","39","128","318","Carvanha"},{"243","83","172","319","Sharpedo"},{"136","68","277","320","Wailmer"},{"175","87","347","321","Wailord"},{"119","79","155","322","Numel"},{"194","136","172","323","Camerupt"},{"151","203","172","324","Torkoal"},{"125","122","155","325","Spoink"},{"171","188","190","326","Grumpig"},{"116","116","155","327","Spinda"},{"162","78","128","328","Trapinch"},{"134","99","137","329","Vibrava"},{"205","168","190","330","Flygon"},{"156","74","137","331","Cacnea"},{"221","115","172","332","Cacturne"},{"76","132","128","333","Swablu"},{"141","201","181","334","Altaria"},{"222","124","177","335","Zangoose"},{"196","118","177","336","Seviper"},{"178","153","207","337","Lunatone"},{"178","153","207","338","Solrock"},{"93","82","137","339","Barboach"},{"151","141","242","340","Whiscash"},{"141","99","125","341","Corphish"},{"224","142","160","342","Crawdaunt"},{"77","124","120","343","Baltoy"},{"140","229","155","344","Claydol"},{"105","150","165","345","Lileep"},{"152","194","200","346","Cradily"},{"176","100","128","347","Anorith"},{"222","174","181","348","Armaldo"},{"29","85","85","349","Feebas"},{"192","219","216","350","Milotic"},{"139","139","172","form","Normal","351","Castform"},{"139","139","172","form","Rainy","351","Castform"},{"139","139","172","form","Snowy","351","Castform"},{"139","139","172","form","Sunny","351","Castform"},{"161","189","155","352","Kecleon"},{"138","65","127","353","Shuppet"},{"218","126","162","354","Banette"},{"70","162","85","355","Duskull"},{"124","234","120","356","Dusclops"},{"136","163","223","357","Tropius"},{"175","170","181","358","Chimecho"},{"246","120","163","359","Absol"},{"41","86","216","360","Wynaut"},{"95","95","137","361","Snorunt"},{"162","162","190","362","Glalie"},{"95","90","172","363","Spheal"},{"137","132","207","364","Sealeo"},{"182","176","242","365","Walrein"},{"133","135","111","366","Clamperl"},{"197","179","146","367","Huntail"},{"211","179","146","368","Gorebyss"},{"162","203","225","369","Relicanth"},{"81","128","125","370","Luvdisc"},{"134","93","128","371","Bagon"},{"172","155","163","372","Shelgon"},{"277","168","216","373","Salamence"},{"96","132","120","374","Beldum"},{"138","176","155","375","Metang"},{"257","228","190","376","Metagross"},{"179","309","190","377","Regirock"},{"179","309","190","378","Regice"},{"143","285","190","379","Registeel"},{"228","246","190","380","Latias"},{"268","212","190","381","Latios"},{"270","228","205","382","Kyogre"},{"270","228","205","383","Groudon"},{"284","170","213","384","Rayquaza"},{"210","210","225","385","Jirachi"},{"414","46","137","form","Attack","386","Deoxys"},{"144","330","137","form","Defense","386","Deoxys"},{"345","115","137","form","Normal","386","Deoxys"},{"230","218","137","form","Speed","386","Deoxys"},{"119","110","146","387","Turtwig"},{"157","143","181","388","Grotle"},{"202","188","216","389","Torterra"},{"113","86","127","390","Chimchar"},{"158","105","162","391","Monferno"},{"222","151","183","392","Infernape"},{"112","102","142","393","Piplup"},{"150","139","162","394","Prinplup"},{"210","186","197","395","Empoleon"},{"101","58","120","396","Starly"},{"142","94","146","397","Staravia"},{"234","140","198","398","Staraptor"},{"80","73","153","399","Bidoof"},{"162","119","188","400","Bibarel"},{"45","74","114","401","Kricketot"},{"160","100","184","402","Kricketune"},{"117","64","128","403","Shinx"},{"159","95","155","404","Luxio"},{"232","156","190","405","Luxray"},{"91","109","120","406","Budew"},{"243","185","155","407","Roserade"},{"218","71","167","408","Cranidos"},{"295","109","219","409","Rampardos"},{"76","195","102","410","Shieldon"},{"94","286","155","411","Bastiodon"},{"53","83","120","form","Plant","412","Burmy"},{"53","83","120","form","Sandy","412","Burmy"},{"53","83","120","form","Trash","412","Burmy"},{"141","180","155","form","Plant","413","Wormadam"},{"141","180","155","form","Sandy","413","Wormadam"},{"127","175","155","form","Trash","413","Wormadam"},{"185","98","172","414","Mothim"},{"59","83","102","415","Combee"},{"149","190","172","416","Vespiquen"},{"94","172","155","417","Pachirisu"},{"132","67","146","418","Buizel"},{"221","114","198","419","Floatzel"},{"108","92","128","420","Cherubi"},{"170","153","172","form","Overcast","421","Cherrim"},{"170","153","172","form","Sunny","421","Cherrim"},{"103","105","183","form","East_sea","422","Shellos"},{"103","105","183","form","West_sea","422","Shellos"},{"169","143","244","form","East_sea","423","Gastrodon"},{"169","143","244","form","West_sea","423","Gastrodon"},{"205","143","181","424","Ambipom"},{"117","80","207","425","Drifloon"},{"180","102","312","426","Drifblim"},{"130","105","146","427","Buneary"},{"156","194","163","428","Lopunny"},{"211","187","155","429","Mismagius"},{"243","103","225","430","Honchkrow"},{"109","82","135","431","Glameow"},{"172","133","174","432","Purugly"},{"114","94","128","433","Chingling"},{"121","90","160","434","Stunky"},{"184","132","230","435","Skuntank"},{"43","154","149","436","Bronzor"},{"161","213","167","437","Bronzong"},{"124","133","137","438","Bonsly"},{"125","142","85","439","Mime Jr."},{"25","77","225","440","Happiny"},{"183","91","183","441","Chatot"},{"169","199","137","442","Spiritomb"},{"124","84","151","443","Gible"},{"172","125","169","444","Gabite"},{"261","193","239","445","Garchomp"},{"137","117","286","446","Munchlax"},{"127","78","120","447","Riolu"},{"236","144","172","448","Lucario"},{"124","118","169","449","Hippopotas"},{"201","191","239","450","Hippowdon"},{"93","151","120","451","Skorupi"},{"180","202","172","452","Drapion"},{"116","76","134","453","Croagunk"},{"211","133","195","454","Toxicroak"},{"187","136","179","455","Carnivine"},{"96","116","135","456","Finneon"},{"142","170","170","457","Lumineon"},{"105","179","128","458","Mantyke"},{"115","105","155","459","Snover"},{"178","158","207","460","Abomasnow"},{"243","171","172","461","Weavile"},{"238","205","172","462","Magnezone"},{"161","181","242","463","Lickilicky"},{"241","190","251","464","Rhyperior"},{"207","184","225","465","Tangrowth"},{"249","163","181","466","Electivire"},{"247","172","181","467","Magmortar"},{"225","217","198","468","Togekiss"},{"231","156","200","469","Yanmega"},{"216","219","163","470","Leafeon"},{"238","205","163","471","Glaceon"},{"185","222","181","472","Gliscor"},{"247","146","242","473","Mamoswine"},{"264","150","198","474","Porygon-Z"},{"237","195","169","475","Gallade"},{"135","275","155","476","Probopass"},{"180","254","128","477","Dusknoir"},{"171","150","172","478","Froslass"},{"204","219","137","form","Fan","479","Rotom"},{"204","219","137","form","Frost","479","Rotom"},{"204","219","137","form","Heat","479","Rotom"},{"204","219","137","form","Mow","479","Rotom"},{"185","159","137","form","Normal","479","Rotom"},{"204","219","137","form","Wash","479","Rotom"},{"156","270","181","480","Uxie"},{"212","212","190","481","Mesprit"},{"270","151","181","482","Azelf"},{"275","211","205","483","Dialga"},{"280","215","189","484","Palkia"},{"251","213","209","485","Heatran"},{"287","210","221","486","Regigigas"},{"187","225","284","form","Altered","487","Giratina"},{"225","187","284","form","Origin","487","Giratina"},{"152","258","260","488","Cresselia"},{"162","162","190","489","Phione"},{"210","210","225","490","Manaphy"},{"285","198","172","491","Darkrai"},{"210","210","225","form","Land","492","Shaymin"},{"261","166","225","form","Sky","492","Shaymin"},{"238","238","237","form","Bug","493","Arceus"},{"238","238","237","form","Dark","493","Arceus"},{"238","238","237","form","Dragon","493","Arceus"},{"238","238","237","form","Electric","493","Arceus"},{"238","238","237","form","Fairy","493","Arceus"},{"238","238","237","form","Fighting","493","Arceus"},{"238","238","237","form","Fire","493","Arceus"},{"238","238","237","form","Flying","493","Arceus"},{"238","238","237","form","Ghost","493","Arceus"},{"238","238","237","form","Grass","493","Arceus"},{"238","238","237","form","Ground","493","Arceus"},{"238","238","237","form","Ice","493","Arceus"},{"238","238","237","form","Normal","493","Arceus"},{"238","238","237","form","Poison","493","Arceus"},{"238","238","237","form","Psychic","493","Arceus"},{"238","238","237","form","Rock","493","Arceus"},{"238","238","237","form","Steel","493","Arceus"},{"238","238","237","form","Water","493","Arceus"},{"118","99","130","808","Meltan"},{"226","190","264","809","Melmetal"}};
        int form = 0;

        
        for(int i = 0; pokestat.length > i; i++){
            String temp = pokestat[i][4].toLowerCase();
            
            if ("form".equals(pokestat[i][3])){
                temp = pokestat[i][6].toLowerCase();
                
            }
            if (temp.equals(namelowcase)){
                int j = 0;
                int tempint = 0;
                if ("form".equals(pokestat[i][3])){
                    form = 1;
                }
                double[] array = new double[3];
                if (form == 1){  
                    int forms = 0;
                    Scanner in = new Scanner(System.in);
                    while ("form".equals(pokestat[i+j][3]) && temp.equals(pokestat[i+j][6].toLowerCase())){
                        System.out.println("pokemon has a/an "+pokestat[i+j][4]+" form type "+(j+1));
                        j++;
                    }
                    while (tempint == 0 || tempint > j){

                            System.out.println("What form do you want?");
                            try {
                                tempint = in.nextInt();
                            }
                            catch(Exception e){
                                System.out.println("error");
                            }

                    }

                }
                else{
                    tempint = 1;
                }
                
                System.out.println("pokemon found");  
                array[0] = Double.parseDouble(pokestat[i+tempint-1][0]);
                array[1] = Double.parseDouble(pokestat[i+tempint-1][1]);
                array[2] = Double.parseDouble(pokestat[i+tempint-1][2]);
                System.out.println(array[0]);  
                System.out.println(array[1]);  
                System.out.println(array[2]);  
                return array;
            }
            else{
                 //System.out.println(temp+" is not equal to: "+namelowcase);   
            }
            
        }
        return null;
    }
    
    
    public static void calcstats(double attack,double defense, double stamina){
        double [][] CPM = {{1,0.094},{1.5,0.135137432},{2,0.16639787},{2.5,0.192650919},{3,0.21573247},{3.5,0.236572661},{4,0.25572005},{4.5,0.273530381},{5,0.29024988},{5.5,0.306057377},{6,0.3210876},{6.5,0.335445036},{7,0.34921268},{7.5,0.362457751},{8,0.37523559},{8.5,0.387592406},{9,0.39956728},{9.5,0.411193551},{10,0.42250001},{10.5,0.432926419},{11,0.44310755},{11.5,0.4530599578},{12,0.46279839},{12.5,0.472336083},{13,0.48168495},{13.5,0.4908558},{14,0.49985844},{14.5,0.508701765},{15,0.51739395},{15.5,0.525942511},{16,0.53435433},{16.5,0.542635767},{17,0.55079269},{17.5,0.558830576},{18,0.56675452},{18.5,0.574569153},{19,0.58227891},{19.5,0.589887917},{20,0.59740001},{20.5,0.604818814},{21,0.61215729},{21.5,0.619399365},{22,0.62656713},{22.5,0.633644533},{23,0.64065295},{23.5,0.647576426},{24,0.65443563},{24.5,0.661214806},{25,0.667934},{25.5,0.674577537},{26,0.68116492},{26.5,0.687680648},{27,0.69414365},{27.5,0.700538673},{28,0.70688421},{28.5,0.713164996},{29,0.71939909},{29.5,0.725571552},{30,0.7317},{30.5,0.734741009},{31,0.73776948},{31.5,0.740785574},{32,0.74378943},{32.5,0.746781211},{33,0.74976104},{33.5,0.752729087},{34,0.75568551},{34.5,0.758630378},{35,0.76156384},{35.5,0.764486065},{36,0.76739717},{36.5,0.770297266},{37,0.7731865},{37.5,0.776064962},{38,0.77893275},{38.5,0.781790055},{39,0.78463697},{39.5,0.787473578},{40,0.79030001}};
        ArrayList<Double> combs = new ArrayList<>();
        int loop = 0;
        int levelstartindex = 0;
        double IVattack = attack+15;
        double IVdefense = defense+15;
        double IVstamina = stamina+15;
        double CPmax = 1500;
        double CPfloor;
        double CPzeroIV = (Math.pow(stamina, 0.5)*attack*Math.pow(defense, 0.5)*Math.pow(CPM[CPM.length-1][1], 2))/10;
        double CPmaxIV = (Math.pow((IVstamina), 0.5)*(IVattack)*Math.pow((IVdefense), 0.5)*Math.pow(CPM[78][1], 2))/10;

        System.out.println(CPzeroIV);
        if (CPzeroIV <= CPmax){
            CPfloor = CPzeroIV;
            if (CPmaxIV <= CPmax){
                levelstartindex = CPM.length-1;
            }   
        }
        else {
            CPfloor = CPmax-50;
        }

        System.out.println(CPmaxIV);

        for (int i = 0; i < CPM.length; i++){
            double CP = (Math.pow(IVstamina, 0.5)*IVattack*Math.pow(IVdefense, 0.5)*Math.pow(CPM[i][1], 2))/10;
            //System.out.println("CP is "+CP+" and lvl "+CPM[i][0]+" CPM "+CPMlevel+" at index "+i);
            CP = Math.floor(CP);
            if (CP > CPmax){
                levelstartindex = i-1;
                System.out.println("Index "+i);
                break;

            }
                        
        }
        for (int j = 0; j <= 15; j++){
            for (int k = 0; k <= 15; k++){
                for (int l = 0; l <= 15; l++){
                    double defenseCPM = Math.pow(defense+k, 0.5);
                    double staminaCPM = Math.pow(stamina+l, 0.5);
                    for (int i = levelstartindex; i < CPM.length; i++){
                        double CPMlevel = CPM[i][1];
                        loop++;
                        double totalstats = ((attack+j)*CPMlevel*(defense+k)*CPMlevel*Math.floor((stamina+l)*CPMlevel)/1000);
                        double totalattack = ((attack+j)*CPMlevel);
                        double totaldefense = ((defense+k)*CPMlevel);
                        double totalstamina = (int)((stamina+l)*CPMlevel);
                        CPMlevel = Math.pow(CPMlevel, 2);
                        //System.out.println("attack "+attack+" defense "+defense+" stamina "+stamina+" CPM "+CPMlevel);
                        double CP = ((attack+j)*defenseCPM*staminaCPM*CPMlevel)/10;
                        CP = Math.floor(CP);
                        if (CP > CPmax){
                            break;
                        }
                        
                        //System.out.println("Index "+i);

                        if (CP >= Math.floor(CPfloor) && CP <= CPmax) {
                            //if (besttotalstat < totalstats){
                            //String testings = "At level " + CPM[i][0] + " CP is: " + CP + " and the totalstats is " + totalstats + " attack " + totalattack + " defense " + totaldefense + " stamina " + totalstamina + " with the IV " + j + ":" + k + ":" + l;
                            //System.out.println(testings);
                            combs.add(totalstats);
                            combs.add(CPM[i][0]);
                            combs.add(CP);
                            combs.add(totalattack);
                            combs.add(totaldefense);
                            combs.add(totalstamina);
                            combs.add((double)j);
                            combs.add((double)k);
                            combs.add((double)l);
                            //}
                            //System.out.println("At level "+CPM[i][0]+" CP is: "+CP+ " and the totalstats is "+totalstats+" attack "+totalattack+" defense "+totaldefense+" stamina "+totalstamina+" with the IV "+j+":"+k+":"+l);
                        }
                    }
                }   
            }
        }
        System.out.println("IV combs looped in "+loop);
        System.out.println("combs size "+combs.size()/9);

        double[][] array2d = new double[combs.size()/9][9];
        int t = 0;
        while(combs.isEmpty()==false){            
            double temptotalstats = combs.remove(0);
            double templevel = combs.remove(0);
            double tempcp = combs.remove(0);
            double temptotalattack = combs.remove(0);
            double temptotaldefense = combs.remove(0);
            double temptotalstamina = combs.remove(0);
            double tempj = combs.remove(0);
            double tempk = combs.remove(0);
            double templ = combs.remove(0);
            array2d[t][0] = temptotalstats;
            array2d[t][1] = templevel;
            array2d[t][2] = tempcp;
            array2d[t][3] = temptotalattack;
            array2d[t][4] = temptotaldefense;
            array2d[t][5] = temptotalstamina;
            array2d[t][6] = tempj;
            array2d[t][7] = tempk;
            array2d[t][8] = templ;
            //System.out.println("copy data "+array2d[t][0]+array2d[t][1]+array2d[t][2]+array2d[t][3]+array2d[t][4]+array2d[t][5]+array2d[t][6]+array2d[t][7]+array2d[t][8]);
        t++;
        }
        //for (int i = 0; i < array2d.length;i++) {
                //System.out.println("At level " + array2d[i][1] + " CP is: " + array2d[i][2] + " and the totalstats is " + array2d[i][0] + " attack " + array2d[i][3] + " defense " + array2d[i][4] + " stamina " + array2d[i][5] + " with the IV " + array2d[i][6] + ":" + array2d[i][7] + ":" + array2d[i][8]);
        //    }
        
        System.out.println(array2d.length);
        array2d = calc.bubblesort(array2d);
        int printcutoff = 50;
        if (array2d.length == 0){
            System.out.println("Array is empty");
        }
        else{
            if (array2d.length <= printcutoff){
                printcutoff = array2d.length-1;
            }
            for (int i = printcutoff; i >= 0;i--) {
                double IVrating = round((((double)array2d[i][6]+(double)array2d[i][7]+(double)array2d[i][8])/45*100),2);
                System.out.println("At lvl " + (int)array2d[i][1] + " CP is: " + (int)array2d[i][2] + " and the totalstats is " + (int)array2d[i][0] + " att " + (int)array2d[i][3] +  " def " + (int)array2d[i][4] + " HP " + (int)array2d[i][5] + " with the IV " + (int)array2d[i][6] + ":" + (int)array2d[i][7] + ":" + (int)array2d[i][8]+" and IV is "+IVrating+"%");
            }
        }
    }
        public static void calcstatscsv(double attack,double defense, double stamina){
        double [][] CPM = {{1,0.094},{1.5,0.135137432},{2,0.16639787},{2.5,0.192650919},{3,0.21573247},{3.5,0.236572661},{4,0.25572005},{4.5,0.273530381},{5,0.29024988},{5.5,0.306057377},{6,0.3210876},{6.5,0.335445036},{7,0.34921268},{7.5,0.362457751},{8,0.37523559},{8.5,0.387592406},{9,0.39956728},{9.5,0.411193551},{10,0.42250001},{10.5,0.432926419},{11,0.44310755},{11.5,0.4530599578},{12,0.46279839},{12.5,0.472336083},{13,0.48168495},{13.5,0.4908558},{14,0.49985844},{14.5,0.508701765},{15,0.51739395},{15.5,0.525942511},{16,0.53435433},{16.5,0.542635767},{17,0.55079269},{17.5,0.558830576},{18,0.56675452},{18.5,0.574569153},{19,0.58227891},{19.5,0.589887917},{20,0.59740001},{20.5,0.604818814},{21,0.61215729},{21.5,0.619399365},{22,0.62656713},{22.5,0.633644533},{23,0.64065295},{23.5,0.647576426},{24,0.65443563},{24.5,0.661214806},{25,0.667934},{25.5,0.674577537},{26,0.68116492},{26.5,0.687680648},{27,0.69414365},{27.5,0.700538673},{28,0.70688421},{28.5,0.713164996},{29,0.71939909},{29.5,0.725571552},{30,0.7317},{30.5,0.734741009},{31,0.73776948},{31.5,0.740785574},{32,0.74378943},{32.5,0.746781211},{33,0.74976104},{33.5,0.752729087},{34,0.75568551},{34.5,0.758630378},{35,0.76156384},{35.5,0.764486065},{36,0.76739717},{36.5,0.770297266},{37,0.7731865},{37.5,0.776064962},{38,0.77893275},{38.5,0.781790055},{39,0.78463697},{39.5,0.787473578},{40,0.79030001}};
        ArrayList<Double> combs = new ArrayList<>();
        int loop = 0;
        int levelstartindex = 0;
        double IVattack = attack+15;
        double IVdefense = defense+15;
        double IVstamina = stamina+15;
        double CPmax = 1500;
        double CPfloor;
        double CPzeroIV = (Math.pow(stamina, 0.5)*attack*Math.pow(defense, 0.5)*Math.pow(CPM[CPM.length-1][1], 2))/10;
        double CPmaxIV = (Math.pow((IVstamina), 0.5)*(IVattack)*Math.pow((IVdefense), 0.5)*Math.pow(CPM[78][1], 2))/10;

        System.out.println(CPzeroIV);
        if (CPzeroIV <= CPmax){
            CPfloor = CPzeroIV;
            if (CPmaxIV <= CPmax){
                levelstartindex = CPM.length-1;
            }   
        }
        else {
            CPfloor = CPmax-50;
        }

        System.out.println(CPmaxIV);

        for (int i = 0; i < CPM.length; i++){
            double CP = (Math.pow(IVstamina, 0.5)*IVattack*Math.pow(IVdefense, 0.5)*Math.pow(CPM[i][1], 2))/10;
            //System.out.println("CP is "+CP+" and lvl "+CPM[i][0]+" CPM "+CPMlevel+" at index "+i);
            CP = Math.floor(CP);
            if (CP > CPmax){
                levelstartindex = i-1;
                System.out.println("Index "+i);
                break;

            }
                        
        }
        for (int j = 10; j <= 15; j++){
            for (int k = 10; k <= 15; k++){
                for (int l = 10; l <= 15; l++){
                    double defenseCPM = Math.pow(defense+k, 0.5);
                    double staminaCPM = Math.pow(stamina+l, 0.5);
                    for (int i = levelstartindex; i < CPM.length; i++){
                        double CPMlevel = CPM[i][1];
                        loop++;
                        double totalstats = ((attack+j)*CPMlevel*(defense+k)*CPMlevel*Math.floor((stamina+l)*CPMlevel)/1000);
                        double totalattack = ((attack+j)*CPMlevel);
                        double totaldefense = ((defense+k)*CPMlevel);
                        double totalstamina = (int)((stamina+l)*CPMlevel);

                        CPMlevel = Math.pow(CPMlevel, 2);
                        //System.out.println("attack "+attack+" defense "+defense+" stamina "+stamina+" CPM "+CPMlevel);
                        double CP = ((attack+j)*defenseCPM*staminaCPM*CPMlevel)/10;
                        CP = Math.floor(CP);
                        if (CP > CPmax){
                            break;
                        }
                        
                        //System.out.println("Index "+i);

                        if (CP >= Math.floor(CPfloor) && CP <= CPmax) {
                            //if (besttotalstat < totalstats){
                            //String testings = "At level " + CPM[i][0] + " CP is: " + CP + " and the totalstats is " + totalstats + " attack " + totalattack + " defense " + totaldefense + " stamina " + totalstamina + " with the IV " + j + ":" + k + ":" + l;
                            //System.out.println(testings);
                            combs.add(totalstats);
                            combs.add(CPM[i][0]);
                            combs.add(CP);
                            combs.add(totalattack);
                            combs.add(totaldefense);
                            combs.add(totalstamina);
                            combs.add((double)j);
                            combs.add((double)k);
                            combs.add((double)l);
                            //}
                            //System.out.println("At level "+CPM[i][0]+" CP is: "+CP+ " and the totalstats is "+totalstats+" attack "+totalattack+" defense "+totaldefense+" stamina "+totalstamina+" with the IV "+j+":"+k+":"+l);
                        }
                    }
                }   
            }
        }
        System.out.println("IV combs looped in "+loop);
        System.out.println("combs size "+combs.size()/9);

        double[][] array2d = new double[combs.size()/9][9];
        int t = 0;
        while(combs.isEmpty()==false){            
            double temptotalstats = combs.remove(0);
            double templevel = combs.remove(0);
            double tempcp = combs.remove(0);
            double temptotalattack = combs.remove(0);
            double temptotaldefense = combs.remove(0);
            double temptotalstamina = combs.remove(0);
            double tempj = combs.remove(0);
            double tempk = combs.remove(0);
            double templ = combs.remove(0);
            array2d[t][0] = temptotalstats;
            array2d[t][1] = templevel;
            array2d[t][2] = tempcp;
            array2d[t][3] = temptotalattack;
            array2d[t][4] = temptotaldefense;
            array2d[t][5] = temptotalstamina;
            array2d[t][6] = tempj;
            array2d[t][7] = tempk;
            array2d[t][8] = templ;
            //System.out.println("copy data "+array2d[t][0]+array2d[t][1]+array2d[t][2]+array2d[t][3]+array2d[t][4]+array2d[t][5]+array2d[t][6]+array2d[t][7]+array2d[t][8]);
        t++;
        }
        //for (int i = 0; i < array2d.length;i++) {
                //System.out.println("At level " + array2d[i][1] + " CP is: " + array2d[i][2] + " and the totalstats is " + array2d[i][0] + " attack " + array2d[i][3] + " defense " + array2d[i][4] + " stamina " + array2d[i][5] + " with the IV " + array2d[i][6] + ":" + array2d[i][7] + ":" + array2d[i][8]);
        //    }
        
        System.out.println(array2d.length);
        array2d = calc.bubblesort(array2d);
        int printcutoff = 49;
        if (array2d.length == 0){
            System.out.println("Array is empty");
        }
        else{
            if (array2d.length <= printcutoff){
                printcutoff = array2d.length-1;
            }
            try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
                StringBuilder sb = new StringBuilder();
                sb.append("Rank#,LVL,CP,Totalstats,Attack,Defense,Stamina,Attack IV,Defense IV,Stamina IV,IV procent");
                sb.append('\n');
                for (int i = printcutoff; i >= 0;i--) {
                    double IVrating = round((((double)array2d[i][6]+(double)array2d[i][7]+(double)array2d[i][8])/45*100),2);
                    String IVratings = Double.toString(IVrating);
                    IVratings = IVratings.replace('.',',');
                
                    sb.append((i+1)+"," + array2d[i][1] + "," + (int)array2d[i][2] + "," + round(array2d[i][0],0) + ","+((int)array2d[i][3]+ (int)array2d[i][4] + (int)array2d[i][5]) +"," + (int)array2d[i][3] +  "," + (int)array2d[i][4] + "," + (int)array2d[i][5] + "," + (int)array2d[i][6] + "," + (int)array2d[i][7] + "," + (int)array2d[i][8]+",\""+IVratings+"\"");
                    sb.append('\n');
                }
        
            writer.write(sb.toString());

            System.out.println("done!");

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
            
            }
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

