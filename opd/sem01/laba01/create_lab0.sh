#!/bin/bash

rm -rf ~/lab0
mkdir ~/lab0
cd ~/lab0

echo "Первый пункт начат
-------"
mkdir archeops5 caterpie0 parasect8

touch hippowdon4
echo "weight=661.4 height=79.0 atk=11 def=12" > hippowdon4

touch salamence7
echo "Ходы  Air Cutter Aqua Tail
Body Slam Defense Curl Defog Draco Meteir Dragon Pulse Fire Fang‡ Fury
Cutter Heat Wave Hyper Voice Iron Tail Mud-Slap Ominous Wind Outrage
Rollout Roost Sleep Talk Snore Steel Wing Swift Tailwind Thunder Fang‡
Twister Zen Headbutt" > salamence7

touch simisear9
echo "satk=10 sdef=6 spd=10" > simisear9

mkdir archeops5/aron archeops5/chikorita archeops5/glalie archeops5/nidoking archeops5/pidgeot archeops5/vullaby

mkdir caterpie0/carvanha caterpie0/jigglypuff caterpie0/scizor
touch caterpie0/paras
echo "Способности Swarm Overgrow Effect
Spore Dry Skin" > 'caterpie0/paras'

touch caterpie0/spheal
echo "Споcобности Defense Curl Growl
Powder Snow Water Gun Encore Ice Ball Body Slam Aurora Beam Hail Rest
Snore Blizzard Sheer Cold" > caterpie0/spheal

touch caterpie0/vuplix
echo "satk=5 sdef=7 spd=7" > caterpie0/vuplix

mkdir parasect8/crobat parasect8/dugtrio parasect8/zebstrika
touch parasect8/jigglypuff
echo "Тип диеты
Herbivore" > parasect8/jigglypuff

touch parasect8/slaking
echo "Тип диеты Omnivore" > parasect8/slaking

touch parasect8/venomoth
echo "Живет" > parasect8/venomoth

echo "Первый пункт завершен!
-------"
echo "Второй пункт начат
-------"

chmod u=rwx,g=rx,o=w archeops5
chmod 570 archeops5/vullaby
chmod 551 archeops5/glalie
chmod u=wx,g=wx,o=wx archeops5/aron
chmod 511 archeops5/nidoking
chmod u=wx,g=rw,o=wx archeops5/chikorita
chmod 337 archeops5/pidgeot
chmod 550 caterpie0
chmod u=rwx,g=wx,o=rwx caterpie0/jigglypuff
chmod u=rw,g=w,o=w caterpie0/vuplix
chmod u=r,g=,o= caterpie0/spheal
chmod 330 caterpie0/carvanha
chmod u=rx,g=wx,o=rwx caterpie0/scizor
chmod u=,g=rw,o=w caterpie0/paras
chmod u=,g=r,o=r hippowdon4
chmod 770 parasect8
chmod u=r,g=,o=r parasect8/slaking
chmod u=rwx,g=wx,o=wx parasect8/zebstrika
chmod u=r,g=,o= parasect8/jigglypuff
chmod u=wx,g=wx,o=rx parasect8/crobat
chmod u=,g=r,o=rw parasect8/venomoth
chmod 570 parasect8/dugtrio
chmod u=rw,g=w,o= salamence7
chmod u=rw,g=,o= simisear9

echo "Второй пункт завершен!
-------"
echo "Третий пункт начат
-------"

chmod u+w caterpie0
chmod u+w parasect8
chmod u+w archeops5/vullaby
chmod u+r parasect8/slaking parasect8/venomoth salamence7 simisear9
chmod u+rx archeops5/aron archeops5/chikorita archeops5/glalie archeops5/nidoking archeops5/pidgeot
chmod u+w parasect8/dugtrio

ln -s ../hippowdon4 caterpie0/vuplixhippowdon
cp -r archeops5 archeops5/vullaby/
cp simisear9 parasect8/dugtrio/
cat parasect8/slaking parasect8/venomoth > hippowdon4_12
ln salamence7 caterpie0/vuplixsalamence
cp salamence7 caterpie0/parassalamence
ln -s caterpie0 Copy_14

chmod u-w caterpie0
chmod u-w parasect8
chmod u-w archeops5/vullaby
chmod u-r parasect8/slaking parasect8/venomoth salamence7 simisear9
chmod u-wx archeops5/aron archeops5/chikorita archeops5/glalie archeops5/nidoking archeops5/pidgeot
chmod u-w parasect8/dugtrio

echo "Третий пункт завершен!
-------"
ls -Rl
echo "Четвертый пункт начат
-------"

chmod u+r caterpie0/paras parasect8/jigglypuff parasect8/slaking salamence7 simisear9
chmod u+rx caterpie0 parasect8 archeops5

# 1
echo "1. Количество строк в файлах на 's', отсортировано по возрастанию:"
find ~/lab0 -type f -name 's*' -print0 | xargs -0 wc -l | sort -n
echo
# !!!! Тут было разрешено использовать команду find, т.к. реализация при помощи разрешенных команд хоть и была написана верно, но не давала ожидаемый результат выполнения.

# 2
echo "2. Файлы на 'g', по убыванию времени модификации:"
ls -Rl 2>/dev/null | grep '^[^d].*g$' | sort -rk6,8
echo

# 3
echo "3. Содержимое paras, slaking, jigglypuff (без строк на e/E):"
cat ~/lab0/caterpie0/paras ~/lab0/parasect8/slaking ~/lab0/parasect8/jigglypuff 2>&1 | grep -vi 'e$' | nl
echo

# 4
echo "4. Три последних файла со строкой 'king' (по дате изменения):"
ls -R ~/lab0 2>/tmp/lab0_err | grep 'king' | xargs ls -lt 2>/tmp/lab0_err | tail -3
echo

# 5
echo "5. Содержимое файлов на 'g', строки z->a:"
ls -R ~/lab0 2>/dev/null | grep 'g$' | xargs cat 2>/dev/null | sort -r | nl
echo

# 6
echo "6. Файлы на 't', по имени a->z:"
ls -Rl ~/lab0 2>&1 | grep '^[^d].*t$' | sort -k9
echo


chmod u-r caterpie0/paras parasect8/jigglypuff parasect8/slaking salamence7 simisear9
chmod u-rx caterpie0 parasect8 archeops5

echo "Четвертый пункт завершен!
-------"
echo "Пятый пункт начат
-------"

chmod u+rwx parasect8
chmod -R u+rwx parasect8
chmod u+rwx caterpie0
chmod u+rwx archeops5

rm -f salamence7
rm -f parasect8/venomoth
rm -f caterpie0/vuplixhippowdon
rm -f caterpie0/vuplixsalamence
rm -rf parasect8
rm -rf archeops5/chikorita

echo "Пятый пункт завершен!
-------"
ls -Rl
echo "ВСЕ ПУНКТЫ ВЫПОЛНЕНЫ!"
