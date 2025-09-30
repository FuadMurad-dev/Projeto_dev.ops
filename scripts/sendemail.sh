#!/bin/bash
cd Projeto
sudo apt-get install -y mailutils

EMAIL_DESTINY=$1
echo "Sending email after pipeline completion" | mail -s "Pipeline" "$EMAIL_DESTINY"
    