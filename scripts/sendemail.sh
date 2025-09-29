cd Projeto
sudo apt-get install mailutils
echo "Sending email after pipeline completion" | mail -s "Pipeline" ${{ secret.EMAIL_DESTINY}}
